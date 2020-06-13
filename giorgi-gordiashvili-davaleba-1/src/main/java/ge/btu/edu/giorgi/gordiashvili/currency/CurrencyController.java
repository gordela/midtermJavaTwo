package ge.btu.edu.giorgi.gordiashvili.currency;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
@Path("/")
public class CurrencyController {
    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Currency> currency() {

        return CurrencyData.getData();
    }

    @GET
    @Path("/currency/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public Currency currency(@PathParam("title") String title) {
        Currency result = null;
        for (Currency currency: CurrencyData.getData()){
            if (currency.getTitle().equals(title)){
                result = currency;
            }
        }
        return result;
    }

}
