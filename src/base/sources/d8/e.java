package d8;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.e1;
import gl.r;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f36427a = new e();

    private e() {
    }

    private final Bundle a(e8.c cVar, Bundle bundle, boolean z10) {
        Bundle bundleH = h(cVar, z10);
        e1.s0(bundleH, "effect_id", cVar.l());
        if (bundle != null) {
            bundleH.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject jSONObjectA = b.a(cVar.j());
            if (jSONObjectA == null) {
                return bundleH;
            }
            e1.s0(bundleH, "effect_arguments", jSONObjectA.toString());
            return bundleH;
        } catch (JSONException e10) {
            throw new FacebookException("Unable to create a JSON Object from the provided CameraEffectArguments: " + e10.getMessage());
        }
    }

    private final Bundle b(e8.f fVar, boolean z10) {
        Bundle bundleH = h(fVar, z10);
        e1.s0(bundleH, "QUOTE", fVar.j());
        e1.t0(bundleH, "MESSENGER_LINK", fVar.a());
        e1.t0(bundleH, "TARGET_DISPLAY", fVar.a());
        return bundleH;
    }

    private final Bundle c(e8.h hVar, List list, boolean z10) {
        Bundle bundleH = h(hVar, z10);
        bundleH.putParcelableArrayList("MEDIA", new ArrayList<>(list));
        return bundleH;
    }

    private final Bundle d(e8.j jVar, List list, boolean z10) {
        Bundle bundleH = h(jVar, z10);
        bundleH.putStringArrayList("PHOTOS", new ArrayList<>(list));
        return bundleH;
    }

    private final Bundle e(e8.k kVar, Bundle bundle, Bundle bundle2, boolean z10) {
        Bundle bundleH = h(kVar, z10);
        if (bundle != null) {
            bundleH.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            bundleH.putParcelable("interactive_asset_uri", bundle2);
        }
        List listN = kVar.n();
        if (listN != null && !listN.isEmpty()) {
            bundleH.putStringArrayList("top_background_color_list", new ArrayList<>(listN));
        }
        e1.s0(bundleH, "content_url", kVar.j());
        return bundleH;
    }

    private final Bundle f(e8.m mVar, String str, boolean z10) {
        Bundle bundleH = h(mVar, z10);
        e1.s0(bundleH, "TITLE", mVar.l());
        e1.s0(bundleH, "DESCRIPTION", mVar.j());
        e1.s0(bundleH, "VIDEO", str);
        return bundleH;
    }

    public static final Bundle g(UUID callId, e8.d shareContent, boolean z10) {
        s.h(callId, "callId");
        s.h(shareContent, "shareContent");
        if (shareContent instanceof e8.f) {
            return f36427a.b((e8.f) shareContent, z10);
        }
        if (shareContent instanceof e8.j) {
            e8.j jVar = (e8.j) shareContent;
            List listH = k.h(jVar, callId);
            if (listH == null) {
                listH = r.l();
            }
            return f36427a.d(jVar, listH, z10);
        }
        if (shareContent instanceof e8.m) {
            e8.m mVar = (e8.m) shareContent;
            return f36427a.f(mVar, k.n(mVar, callId), z10);
        }
        if (shareContent instanceof e8.h) {
            e8.h hVar = (e8.h) shareContent;
            List listF = k.f(hVar, callId);
            if (listF == null) {
                listF = r.l();
            }
            return f36427a.c(hVar, listF, z10);
        }
        if (shareContent instanceof e8.c) {
            e8.c cVar = (e8.c) shareContent;
            return f36427a.a(cVar, k.l(cVar, callId), z10);
        }
        if (!(shareContent instanceof e8.k)) {
            return null;
        }
        e8.k kVar = (e8.k) shareContent;
        return f36427a.e(kVar, k.e(kVar, callId), k.k(kVar, callId), z10);
    }

    private final Bundle h(e8.d dVar, boolean z10) {
        Bundle bundle = new Bundle();
        e1.t0(bundle, "LINK", dVar.a());
        e1.s0(bundle, "PLACE", dVar.e());
        e1.s0(bundle, "PAGE", dVar.b());
        e1.s0(bundle, "REF", dVar.f());
        e1.s0(bundle, "REF", dVar.f());
        bundle.putBoolean("DATA_FAILURES_FATAL", z10);
        List listC = dVar.c();
        if (listC != null && !listC.isEmpty()) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(listC));
        }
        e8.e eVarG = dVar.g();
        e1.s0(bundle, "HASHTAG", eVarG != null ? eVarG.a() : null);
        return bundle;
    }
}
