package com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends qor {
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj gjv;
    protected List<String> hnj;
    private final Context qor;

    public hnj(Context context, com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        super(context);
        this.hnj = new ArrayList();
        this.qor = context;
        this.gjv = hnjVar;
        if (hnjVar == null) {
            this.gjv = com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj.qor();
        }
    }

    public byte gjv() {
        return (byte) 0;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor
    public String hn() {
        com.bytedance.sdk.component.dkl.hnj.hnj.sk skVarQor = com.bytedance.sdk.component.dkl.hnj.dse.dkl().qor();
        if (skVarQor != null) {
            return skVarQor.hn();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0027 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
      0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int hnj() {
        Cursor cursorHnj = null;
        int i10 = 0;
        try {
            cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorHnj != null) {
                cursorHnj.moveToFirst();
                i10 = cursorHnj.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorHnj != null) {
                try {
                    cursorHnj.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i10;
    }

    public byte qor() {
        return (byte) 2;
    }

    public void hn(List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.dkl.hnj.gjv.hnj hnjVar : list) {
            linkedList.add(hnjVar.qor());
            com.bytedance.sdk.component.dkl.hnj.qor.hnj.ta(hnjVar);
        }
        hn();
        linkedList.size();
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), "DELETE FROM " + hn() + " WHERE " + hnj("id", linkedList, 1000, true));
        qor(linkedList);
    }

    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b10;
        Cursor cursorHnj;
        long jHnj = com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj(i10, sk());
        hn();
        if (jHnj <= 0) {
            jHnj = 1;
        } else if (jHnj > 100) {
            jHnj = 100;
        }
        String str4 = str + " DESC limit " + jHnj;
        ArrayList arrayList = new ArrayList();
        this.hnj.clear();
        long jJip = com.bytedance.sdk.component.dkl.hnj.dse.dkl().jip();
        if (jJip > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jJip)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.dkl.hnj.qor.hnj.gjv() && gjv() == 3) {
            str3 = "id";
            b10 = 3;
            cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b10 = 3;
            cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), new String[]{str3, AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorHnj;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.dkl.hnj.sk skVarFc = com.bytedance.sdk.component.dkl.hnj.dse.dkl().fc();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.dkl.hnj.qor.hnj.gjv() && gjv() == b10) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = skVarFc.hnj(string2);
                            } catch (Throwable th2) {
                                th = th2;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.hnj.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj hnjVar = new com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj(string, jSONObject);
                            hnjVar.hn(gjv());
                            hnjVar.qor(qor());
                            if (com.bytedance.sdk.component.dkl.hnj.qor.hnj.gjv() && gjv() == b10) {
                                hnjVar.hnj(i12);
                            }
                            com.bytedance.sdk.component.dkl.hnj.qor.hnj.hnj(jSONObject, hnjVar);
                            arrayList.add(hnjVar);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                try {
                    cursor.close();
                    if (!this.hnj.isEmpty()) {
                        hnj(this.hnj);
                        this.hnj.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th4) {
                try {
                    cursor.close();
                    if (!this.hnj.isEmpty()) {
                        hnj(this.hnj);
                        this.hnj.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th4;
            }
        }
        hn();
        arrayList.size();
        return arrayList;
    }

    private void hn(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            hn();
        }
    }

    public static String hn(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(String str) {
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar = this.gjv;
        if (hnjVar == null) {
            return new ArrayList();
        }
        return hnj(hnjVar.hn(), str);
    }

    protected void hnj(List<String> list) {
        hn();
        list.size();
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), "DELETE FROM " + hn() + " WHERE " + hnj("id", list, 1000, true));
        com.bytedance.sdk.component.dkl.hnj.qor.hn.hnj(com.bytedance.sdk.component.dkl.hnj.hn.gjv.gjv.izk(), list.size());
        qor(list);
    }

    public void hnj(int i10, long j10) {
        hn(i10, j10);
    }

    public boolean hnj(int i10) {
        if (this.gjv == null) {
            return false;
        }
        int iHnj = hnj();
        int iHnj2 = this.gjv.hnj();
        hn();
        if (com.bytedance.sdk.component.dkl.hnj.qor.hnj.qor() && (i10 == 1 || i10 == 2)) {
            return iHnj > 0;
        }
        return iHnj >= iHnj2;
    }

    private static String hnj(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strHnj = hnj(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(strHnj);
            sb2.append("')");
        }
        return hnj(sb2.toString(), str + str2 + "('')");
    }

    private static String hnj(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
