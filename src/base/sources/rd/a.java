package rd;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f51279a;

    public a(pd.j jVar) {
        this.f51279a = jVar.g("com.crashlytics.settings.json");
    }

    private File a() {
        return this.f51279a;
    }

    public JSONObject b() throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        gd.g.f().b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileA = a();
                if (fileA.exists()) {
                    fileInputStream = new FileInputStream(fileA);
                    try {
                        jSONObject = new JSONObject(jd.i.B(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        gd.g.f().e("Failed to fetch cached settings", e);
                        jd.i.f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    gd.g.f().i("Settings file does not exist.");
                    jSONObject = null;
                }
                jd.i.f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Throwable th3) {
                th2 = th3;
                jd.i.f(null, "Error while closing settings cache file.");
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            jd.i.f(null, "Error while closing settings cache file.");
            throw th2;
        }
    }

    public void c(long j10, JSONObject jSONObject) throws Throwable {
        gd.g.f().i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j10);
                FileWriter fileWriter2 = new FileWriter(a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    jd.i.f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    gd.g.f().e("Failed to cache settings", e);
                    jd.i.f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    jd.i.f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }
}
