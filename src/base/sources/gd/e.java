package gd;

import gl.r;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.s;
import ld.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements me.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f39117a;

    public e(o userMetadata) {
        s.h(userMetadata, "userMetadata");
        this.f39117a = userMetadata;
    }

    @Override // me.f
    public void a(me.e rolloutsState) {
        s.h(rolloutsState, "rolloutsState");
        o oVar = this.f39117a;
        Set<me.d> setB = rolloutsState.b();
        s.g(setB, "getRolloutAssignments(...)");
        ArrayList arrayList = new ArrayList(r.v(setB, 10));
        for (me.d dVar : setB) {
            arrayList.add(ld.j.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        oVar.o(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
