package nl.knaw.huc.di.sd;


import nl.mpi.oai.harvester.action.Action;
import nl.mpi.oai.harvester.metadata.Metadata;

import java.util.List;

public class HelloWorldAction implements Action {
    @Override
    public boolean perform(List<Metadata> list) {
        System.out.println("Hello World! Performing!");
        return false;
    }

    @Override
    public Action clone() {
        System.out.println("Hello World! Cloning!");
        return null;
    }
}
