package cl.mind.streessless2.data;

import java.util.ArrayList;
import java.util.List;

import cl.mind.streessless2.models.Pending;

/**
 * Created by Gabriel on 15-08-2017.
 */

public class Queries {

    public List<Pending> pendings() {


        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.find(Pending.class,"done = 0");

        if (pendingList != null && pendingList.size() > 0) {

            pendings.addAll(pendingList);

        }

        return pendings;

    }

}
