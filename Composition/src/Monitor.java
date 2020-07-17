public class Monitor {
    private String model;
    private String manufacturer;
    private String panel;
    private int size;
    private int refreshRate;
    private int motionBlurReduction;
    private Resolution nativeResolution;
    private boolean g_sync;

    public Monitor(String model, String manufacturer, String panel, int size, int refreshRate,
                   int motionBlurReduction, Resolution nativeResolution, boolean g_sync) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.panel = panel;
        this.size = size;
        this.refreshRate = refreshRate;
        this.motionBlurReduction = motionBlurReduction;
        this.nativeResolution = nativeResolution;
        this.g_sync = g_sync;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPanel() {
        return panel;
    }

    public int getSize() {
        return size;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public int getMotionBlurReduction() {
        return motionBlurReduction;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public boolean isG_sync() {
        return g_sync;
    }
}
