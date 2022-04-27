package az.iktlab.groupj4web.service.impl.util.diaandic.spring;

import org.springframework.stereotype.Service;

@Service
public class HumanService {

    private final HumanRepository humanRepository;
    private  final HumanRepositoryV2 humanRepositoryV2;

    public HumanService(HumanRepository humanRepository, HumanRepositoryV2 humanRepositoryV2) {
        this.humanRepository = humanRepository;
        this.humanRepositoryV2 = humanRepositoryV2;
    }
}
