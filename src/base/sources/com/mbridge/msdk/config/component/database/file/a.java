package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import com.google.api.client.http.HttpMethods;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f28730a = "FileOperate";

    public void a(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d(str.startsWith(HttpMethods.DELETE) ? str.replaceFirst(HttpMethods.DELETE, "SELECT") : str.startsWith("delete") ? str.replaceFirst("delete", "SELECT") : "");
        if (mapD == null || mapD.isEmpty() || !(mapD.get(DataSchemeDataSource.SCHEME_DATA) instanceof List) || (arrayList = (ArrayList) mapD.get(DataSchemeDataSource.SCHEME_DATA)) == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                if (((String) entry.getKey()).equals("filePath")) {
                    arrayList2.add(String.valueOf(entry.getValue()));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            a(new File((String) obj2));
        }
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}
