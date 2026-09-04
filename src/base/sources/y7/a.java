package y7;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import u7.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0881a f57445d = new C0881a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f57446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f57447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f57448c;

    /* JADX INFO: renamed from: y7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0881a {
        public /* synthetic */ C0881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0881a() {
        }
    }

    public a(String str) {
        this.f57448c = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f57447b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.f57448c;
        s.f(l10, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        s.g(string, "StringBuffer()\n         …)\n            .toString()");
        this.f57446a = string;
    }

    public final void a() {
        k.d(this.f57446a);
    }

    public final int b(a data) {
        s.h(data, "data");
        Long l10 = this.f57448c;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.f57448c;
        if (l11 != null) {
            return s.j(l11.longValue(), jLongValue);
        }
        return 1;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f57448c;
            if (l10 != null) {
                jSONObject.put(CampaignEx.JSON_KEY_TIMESTAMP, l10);
            }
            jSONObject.put("error_message", this.f57447b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.f57447b == null || this.f57448c == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            k.t(this.f57446a, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return super.toString();
        }
        String string = jSONObjectC.toString();
        s.g(string, "params.toString()");
        return string;
    }

    public a(File file) {
        s.h(file, "file");
        String name = file.getName();
        s.g(name, "file.name");
        this.f57446a = name;
        JSONObject jSONObjectR = k.r(name, true);
        if (jSONObjectR != null) {
            this.f57448c = Long.valueOf(jSONObjectR.optLong(CampaignEx.JSON_KEY_TIMESTAMP, 0L));
            this.f57447b = jSONObjectR.optString("error_message", null);
        }
    }
}
