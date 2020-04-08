package tweets.inference.app;

import org.apache.jena.atlas.logging.LogCtl;

public class TweetsInferenceApp {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            LogCtl.setCmdLogging();
            new AppWindow().setVisible(true);
        });
    }
    
}
