module com.asgarov.tours.provider {
    requires com.asgarov.tours.api;
    provides com.asgarov.tours.api.Tour with com.asgarov.tour.provider.TourImpl;
}