package callback_delete;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class callback_delete {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-25ZY8HQwZPuQtDecrxb671LilUya5t5G0");

Callback callback = new Callback("/callbacks/CB2xCnObyAUU1V658GVuRyCI");

try {
    callback.delete();
}
catch (APIError e) {}
catch (NotCreated e) {}

}
}

