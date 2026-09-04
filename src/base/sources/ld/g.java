package ld;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Charset f44325b = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pd.j f44326a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f44327a;

        a(String str) throws JSONException {
            this.f44327a = str;
            put("userId", str);
        }
    }

    public g(pd.j jVar) {
        this.f44326a = jVar;
    }

    private static Map e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, p(jSONObject, next));
        }
        return map;
    }

    private static List f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                gd.g.f().l("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    private String g(String str) {
        return p(new JSONObject(str), "userId");
    }

    private static String h(Map map) {
        return new JSONObject(map).toString();
    }

    private static String l(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f44353a.b(list.get(i10))));
            } catch (JSONException e10) {
                gd.g.f().l("Exception parsing rollout assignment!", e10);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    private static void m(File file) {
        if (file.exists() && file.delete()) {
            gd.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static void n(File file, String str) {
        if (file.exists() && file.delete()) {
            gd.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    private static String o(String str) {
        return new a(str).toString();
    }

    private static String p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public File a(String str) {
        return this.f44326a.q(str, "internal-keys");
    }

    public File b(String str) {
        return this.f44326a.q(str, "keys");
    }

    public File c(String str) {
        return this.f44326a.q(str, "rollouts-state");
    }

    public File d(String str) {
        return this.f44326a.q(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map i(String str, boolean z10) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            n(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    Map mapE = e(jd.i.B(fileInputStream));
                    jd.i.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e11) {
                    e10 = e11;
                    gd.g.f().l("Error deserializing user metadata.", e10);
                    m(fileA);
                    jd.i.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                jd.i.f(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th4) {
            ?? r10 = 0;
            th2 = th4;
            jd.i.f(r10, "Failed to close user metadata file.");
            throw th2;
        }
    }

    public List j(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            n(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List listF = f(jd.i.B(fileInputStream2));
                    gd.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    jd.i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    gd.g.f().l("Error deserializing rollouts state.", e);
                    m(fileC);
                    jd.i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    jd.i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public String k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            gd.g.f().b("No userId set for session " + str);
            m(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(jd.i.B(fileInputStream));
                    gd.g.f().b("Loaded userId " + strG + " for session " + str);
                    jd.i.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e10) {
                    e = e10;
                    gd.g.f().l("Error deserializing user metadata.", e);
                    m(fileD);
                    jd.i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                jd.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            jd.i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void q(String str, Map map) throws Throwable {
        r(str, map, false);
    }

    public void r(String str, Map map, boolean z10) throws Throwable {
        File fileA = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strH = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f44325b));
                try {
                    bufferedWriter2.write(strH);
                    bufferedWriter2.flush();
                    jd.i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    gd.g.f().l("Error serializing key/value metadata.", e);
                    m(fileA);
                    jd.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    jd.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void s(String str, List list) throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e10;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            n(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strL = l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f44325b));
                try {
                    bufferedWriter.write(strL);
                    bufferedWriter.flush();
                    jd.i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e10 = e11;
                    gd.g.f().l("Error serializing rollouts state.", e10);
                    m(fileC);
                    jd.i.f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                jd.i.f(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th4) {
            IsEmpty = 0;
            th2 = th4;
            jd.i.f(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void t(String str, String str2) throws Throwable {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strO = o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f44325b));
                try {
                    bufferedWriter2.write(strO);
                    bufferedWriter2.flush();
                    jd.i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    gd.g.f().l("Error serializing user metadata.", e);
                    jd.i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    jd.i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
