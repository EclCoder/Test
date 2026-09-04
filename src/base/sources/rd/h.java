package rd;

import jd.l0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f51312a;

    h(l0 l0Var) {
        this.f51312a = l0Var;
    }

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        gd.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new b();
    }

    public d b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.f51312a, jSONObject);
    }
}
