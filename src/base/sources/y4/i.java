package y4;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i implements ProfileStore {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ProfileStore f57372b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProfileStoreBoundaryInterface f57373a;

    private i(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f57373a = profileStoreBoundaryInterface;
    }

    public static ProfileStore getInstance() {
        if (f57372b == null) {
            f57372b = new i(p.c().getProfileStore());
        }
        return f57372b;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (o.f57386c0.d()) {
            return this.f57373a.deleteProfile(str);
        }
        throw o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (o.f57386c0.d()) {
            return this.f57373a.getAllProfileNames();
        }
        throw o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public x4.b getOrCreateProfile(String str) {
        if (o.f57386c0.d()) {
            return new h((ProfileBoundaryInterface) jp.a.a(ProfileBoundaryInterface.class, this.f57373a.getOrCreateProfile(str)));
        }
        throw o.a();
    }

    @Override // androidx.webkit.ProfileStore
    public x4.b getProfile(String str) {
        if (!o.f57386c0.d()) {
            throw o.a();
        }
        InvocationHandler profile = this.f57373a.getProfile(str);
        if (profile != null) {
            return new h((ProfileBoundaryInterface) jp.a.a(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }
}
