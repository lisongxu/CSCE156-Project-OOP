package unl.soc;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Account> accounts = new HashMap<>();
        Account currentAccount = null;
        List<Post> postList = new ArrayList<>();

        Views.mainWindow();
        Views.accountRegistrationWindow();
        Views.accountLoginWindow();
        Views.postViewWindow(postList, currentAccount);
       	Views.newPostWindow(currentAccount);
       	Views.displayTextArtOptions(currentAccount);
    }

}
