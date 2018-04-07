package org.pg.etherum;

import org.springframework.stereotype.Component;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/api")
public class Endpoint {

    @GET
    @Path("/ping")
    public boolean ping() {
        return true;
    }

    public Contract getOwner() {
        Web3j w = Web3j.build(new HttpService());


    }
}
