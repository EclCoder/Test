package dd;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f36644a = new i() { // from class: dd.h
        @Override // dd.i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
