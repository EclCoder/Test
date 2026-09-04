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
public class dse extends qor {
    protected List<String> hnj;
    private com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj qor;

    public dse(Context context, com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar) {
        super(context);
        this.hnj = new ArrayList();
        this.qor = hnjVar;
        if (hnjVar == null) {
            this.qor = com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj.qor();
        }
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor
    protected long dkl() {
        return com.bytedance.sdk.component.dkl.hnj.dse.hnj.hn();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int gjv() {
        Cursor cursorHnj;
        int i10 = 0;
        try {
            cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorHnj != null) {
                try {
                    cursorHnj.moveToFirst();
                    i10 = cursorHnj.getInt(0);
                } catch (Throwable unused) {
                    if (cursorHnj != null) {
                        try {
                            cursorHnj.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorHnj != null) {
                cursorHnj.close();
            }
        } catch (Throwable unused3) {
            cursorHnj = null;
        }
        return i10;
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hnj.qor
    public String hn() {
        return com.bytedance.sdk.component.dkl.hnj.dse.dkl().qor().gjv();
    }

    public byte hnj() {
        return (byte) 1;
    }

    public byte qor() {
        return (byte) 2;
    }

    public static String qor(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hn(String str) {
        com.bytedance.sdk.component.dkl.hnj.gjv.hn.hnj hnjVar = this.qor;
        return hnjVar == null ? new ArrayList() : hnj(hnjVar.hn(), str);
    }

    public List<com.bytedance.sdk.component.dkl.hnj.gjv.hnj> hnj(int i10, String str) {
        long jHnj = com.bytedance.sdk.component.dkl.hnj.hn.hnj.hnj(i10, sk());
        if (jHnj <= 0) {
            jHnj = 1;
        } else if (jHnj > 100) {
            jHnj = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.hnj.clear();
        Cursor cursorHnj = com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), new String[]{"id", AppMeasurementSdk.ConditionalUserProperty.VALUE, "encrypt"}, null, null, null, null, str + " DESC limit " + jHnj);
        if (cursorHnj != null) {
            while (cursorHnj.moveToNext()) {
                try {
                    try {
                        String string = cursorHnj.getString(cursorHnj.getColumnIndex("id"));
                        String string2 = cursorHnj.getString(cursorHnj.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        if (cursorHnj.getInt(cursorHnj.getColumnIndex("encrypt")) == 1) {
                            string2 = com.bytedance.sdk.component.dkl.hnj.dse.dkl().fc().hnj(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.hnj.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj hnjVar = new com.bytedance.sdk.component.dkl.hnj.gjv.hnj.hnj(string, new JSONObject(string2));
                            hnjVar.qor(qor());
                            hnjVar.hn(hnj());
                            arrayList.add(hnjVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorHnj.close();
                        if (!this.hnj.isEmpty()) {
                            hnj(this.hnj);
                            this.hnj.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
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

    private void hn(int i10, long j10) {
        com.bytedance.sdk.component.dkl.hnj.hnj.hnj.qor.hnj(sk(), hn(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
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
        return this.qor != null && gjv() >= this.qor.hnj();
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
