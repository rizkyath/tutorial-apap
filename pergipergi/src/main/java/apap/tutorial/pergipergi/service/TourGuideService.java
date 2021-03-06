package apap.tutorial.pergipergi.service;

import apap.tutorial.pergipergi.model.TourGuideModel;

public interface TourGuideService {
    void addTourGuide(TourGuideModel tourGuide);
    TourGuideModel getByNoTourGuide(Long noTourGuide);
    TourGuideModel updateTourGuide(TourGuideModel guide);
    TourGuideModel deleteTourGuide(TourGuideModel guide);
}
