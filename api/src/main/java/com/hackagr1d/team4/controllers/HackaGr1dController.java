package com.hackagr1d.team4.controllers;


import com.hackagr1d.team4.helpers.ApiConstants;
import com.hackagr1d.team4.rest.vo.CotacaoRequest;
import com.hackagr1d.team4.rest.vo.CotacaoResponse;
import com.hackagr1d.team4.services.CotacaoService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
@Api(tags = { ApiConstants.API_NAME })
public class HackaGr1dController {

    private CotacaoService service;

    @Autowired
    public HackaGr1dController(
            final CotacaoService service) {
        this.service = service;

    }

    @ApiOperation(value = "Retorna lista de cotações", response = CotacaoResponse.class)
    @ApiImplicitParams({
            @ApiImplicitParam(value = "Cross transaction unique ID. Used to track the request across systems.", required = true, dataTypeClass = String.class, name = "requestTraceId", paramType = "header"),
            @ApiImplicitParam(value = "JWT token", required = true, dataTypeClass = String.class, name = "Authorization", paramType = "header"),
            @ApiImplicitParam(value = "Country", required = true, dataTypeClass = String.class, name = "country", paramType = "header")})
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, path="/cotacao}")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found") })
    public ResponseEntity<CotacaoResponse> getCotacao(
            @Valid @RequestBody final CotacaoRequest request) {
            return new ResponseEntity(service.getCotacoes(request), HttpStatus.OK);




    }


}

