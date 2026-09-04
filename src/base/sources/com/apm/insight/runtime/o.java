package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.entity.Header;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f11010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f11011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f11012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f11013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f11014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f11015f = null;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f11018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f11019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f11020c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f11021d;

        /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        static /* synthetic */ void d(a aVar) {
            aVar.f11020c.delete();
        }

        private a(File file) {
            this.f11021d = null;
            this.f11020c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f11018a = Long.parseLong(strArrSplit[0]);
                this.f11019b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f11018a = j10;
                this.f11019b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f11021d == null) {
                try {
                    this.f11021d = new JSONObject(com.apm.insight.l.f.a(this.f11020c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f11021d == null) {
                    this.f11021d = new JSONObject();
                }
            }
            return this.f11021d;
        }

        static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f11018a;
            if (j11 > j10 && j11 - j10 > 604800000) {
                return true;
            }
            long j12 = aVar.f11019b;
            if (j12 >= j10 || j10 - j12 <= 604800000) {
                return aVar.f11020c.lastModified() < j10 && j10 - aVar.f11020c.lastModified() > 604800000;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f11011b = fileC;
        this.f11012c = new File(fileC, "did");
        this.f11013d = new File(fileC, "device_uuid");
        this.f11014e = context;
    }

    public static o a() {
        if (f11010a == null) {
            f11010a = new o(com.apm.insight.e.g());
        }
        return f11010a;
    }

    protected final String b() {
        try {
            return com.apm.insight.l.f.a(this.f11012c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f11013d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f11011b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b10 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b10);
                    arrayList.add(aVar2);
                    if (this.f11015f == null && ".ctx".equals(str) && (aVar == null || aVar2.f11019b >= aVar.f11019b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    j.a(th2, "NPTH_CATCH");
                }
            }
            if (this.f11015f == null && aVar != null) {
                this.f11015f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject jSONObjectA = Header.a(this.f11014e).a(map);
        if (Header.c(jSONObjectA)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f11015f == null) {
            c(".ctx");
        }
        a aVar = this.f11015f;
        if (aVar != null) {
            JSONObject jSONObjectA2 = aVar.a();
            if (!Header.c(jSONObjectA2)) {
                if (!Header.c(jSONObjectA)) {
                    if (String.valueOf(jSONObjectA.opt("update_version_code")).equals(String.valueOf(jSONObjectA2.opt("update_version_code"))) && Header.d(jSONObjectA2)) {
                        a(aVar.f11018a, jCurrentTimeMillis, jSONObjectA, jSONArray);
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        com.apm.insight.l.f.a(aVar.f11020c);
                    } else {
                        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
                    }
                }
            } else {
                a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
            }
            try {
                ArrayList<a> arrayListC = c("");
                if (arrayListC.size() <= 6) {
                    return;
                }
                int size = arrayListC.size();
                int i10 = 0;
                while (i10 < size) {
                    a aVar2 = arrayListC.get(i10);
                    i10++;
                    a aVar3 = aVar2;
                    if (a.a(aVar3, jCurrentTimeMillis)) {
                        a.d(aVar3);
                    }
                }
                return;
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
                return;
            }
        }
        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f11013d, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONArray b(long j10) {
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".allData");
        int size = arrayListC.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i11);
            i11++;
            a aVar2 = aVar;
            if (j10 >= aVar2.f11018a && j10 <= aVar2.f11019b) {
                file = aVar2.f11020c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".allData");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i10 < size2) {
                a aVar4 = arrayListC2.get(i10);
                i10++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.f11019b - j10) > Math.abs(aVar5.f11019b - j10)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.f11020c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    return new JSONArray(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        return null;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f11011b, j10 + "-" + j11 + ".ctx");
        File file2 = new File(this.f11011b, j10 + "-" + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f11015f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            j.a(e10, "NPTH_CATCH");
        }
    }

    protected final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f11012c, str, false);
        } catch (Throwable unused) {
        }
    }

    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        String strA;
        ArrayList<a> arrayListC = c(".ctx");
        int size = arrayListC.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            jSONObject = null;
            if (i11 >= size) {
                file = null;
                break;
            }
            a aVar = arrayListC.get(i11);
            i11++;
            a aVar2 = aVar;
            if (j10 >= aVar2.f11018a && j10 <= aVar2.f11019b) {
                file = aVar2.f11020c;
                break;
            }
        }
        if (file == null) {
            ArrayList<a> arrayListC2 = c(".ctx");
            int size2 = arrayListC2.size();
            a aVar3 = null;
            while (i10 < size2) {
                a aVar4 = arrayListC2.get(i10);
                i10++;
                a aVar5 = aVar4;
                if (aVar3 == null || Math.abs(aVar3.f11019b - j10) > Math.abs(aVar5.f11019b - j10)) {
                    aVar3 = aVar5;
                }
            }
            file = aVar3 == null ? null : aVar3.f11020c;
            i10 = 1;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        if (jSONObject != null && i10 != 0) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
