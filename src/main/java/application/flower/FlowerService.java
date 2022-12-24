package application.flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
//        return List.of(new Flower(1, "blue", 100.0, 100.0),
//                new Flower(2, "green", 100.0, 100.0),
//                new Flower(3, "red", 100.0, 100.0));
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
