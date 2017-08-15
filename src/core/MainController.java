package core;

import com.ebay.services.client.ClientConfig;
import com.ebay.services.client.FindingServiceClientFactory;
import com.ebay.services.finding.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.List;

public class MainController {

    @FXML
    Button btAddCondition;

    @FXML
    Pane pnMain;

    @FXML
    private void btAddConditionListener(ActionEvent event) throws IOException {
        if (btAddCondition.getText().equals("Đóng")) {
            pnMain.getChildren().clear();
            btAddCondition.setText("Thêm Điều Kiện");
        }
        else {
            Pane newLoadedPane = FXMLLoader.load(getClass().getResource("../view/search.fxml"));
            pnMain.getChildren().add(newLoadedPane);
            btAddCondition.setText("Đóng");
        }
    }

    public static void main(String[] args) {
        runSearch();
    }

    private static void runSearch(){
        try {
            // initialize service end-point configuration
            ClientConfig config = new ClientConfig();
            // endpoint address can be overwritten here, by default, production address is used,
            // to enable sandbox endpoint, just uncomment the following line
            //config.setEndPointAddress("http://svcs.sandbox.ebay.com/services/search/FindingService/v1");
            config.setApplicationId("CUONGNGU-Searcheb-PRD-a8e01d5e3-4e799e2d");

            //create a service client
            FindingServicePortType serviceClient = FindingServiceClientFactory.getServiceClient(config);
//
//            //create request object
//            FindItemsAdvancedRequest request = new FindItemsAdvancedRequest();
//            //set request parameters
//            request.setKeywords("harry potter phoenix");
//            // Add condition
//            AspectFilter aspectFilter = new AspectFilter();
//            aspectFilter.setAspectName("LH_LocatedIn");
//            aspectFilter.getAspectValueName().add("Ukraine");
//            request.getAspectFilter().add(aspectFilter);
//
//
//            PaginationInput pi = new PaginationInput();
//            pi.setEntriesPerPage(2);
//            request.setPaginationInput(pi);
//
//            //call service
//            FindItemsAdvancedResponse result = serviceClient.findItemsAdvanced(request);
//
            FindItemsAdvancedRequest request = new FindItemsAdvancedRequest();
            request.setKeywords("watch");
            AspectFilter aspectFilter = new AspectFilter();
            aspectFilter.setAspectName("Brand");
            aspectFilter.getAspectValueName().add("Paula Abdul");
            aspectFilter.getAspectValueName().add("Tiffany");
            aspectFilter.getAspectValueName().add("Tommy Hilfiger");
            request.getAspectFilter().add(aspectFilter);

            aspectFilter = new AspectFilter();
            aspectFilter.setAspectName("Main Color");
            aspectFilter.getAspectValueName().add("Gold");
            aspectFilter.getAspectValueName().add("Silver");
            request.getAspectFilter().add(aspectFilter);
            PaginationInput pi = new PaginationInput();
            pi.setEntriesPerPage(2);
            request.setPaginationInput(pi);

            FindItemsAdvancedResponse result = serviceClient.findItemsAdvanced(request);
            System.out.println("Found " + result.getSearchResult().getCount() + " items." );
            List<SearchItem> items = result.getSearchResult().getItem();
            for(SearchItem item : items) {System.out.println(item.getTitle());}
        } catch (Exception ex) {
            // handle exception if any
            ex.printStackTrace();
        }
    }
}
