package com.bytedance.sdk.component.adexpress.hnj.hn;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.utils.nyv;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class qor {
    public List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> hn(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar, com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (hnjVar2 == null || hnjVar2.dkl().isEmpty()) {
            arrayList2.addAll(hnjVar.dkl());
        } else if (hnjVar.dkl().isEmpty()) {
            arrayList.addAll(hnjVar2.dkl());
        } else {
            for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : hnjVar.dkl()) {
                if (!hnjVar2.dkl().contains(c0184hnj) && c0184hnj != null && c0184hnj.hnj() != null && c0184hnj.hn() != null) {
                    arrayList2.add(c0184hnj);
                }
            }
            for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj2 : hnjVar2.dkl()) {
                if (!hnjVar.dkl().contains(c0184hnj2)) {
                    arrayList.add(c0184hnj2);
                }
            }
        }
        if (hnj(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File hnj();

    protected boolean hnj(Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar = map.get(it.next());
            if (hnjVar != null && !hnj(hnjVar.dkl())) {
                return false;
            }
        }
        return true;
    }

    public void qor(List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(hnj(), com.bytedance.sdk.component.utils.sk.hnj(it.next().hnj()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    protected boolean hnj(List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> list) {
        if (list == null || list.size() <= 0 || hnj() == null) {
            return false;
        }
        for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : list) {
            String strHnj = com.bytedance.sdk.component.utils.sk.hnj(c0184hnj.hnj());
            if (TextUtils.isEmpty(strHnj)) {
                return false;
            }
            File file = new File(hnj(), strHnj);
            String strHnj2 = com.bytedance.sdk.component.utils.sk.hnj(file);
            if (!file.exists() || !file.isFile() || c0184hnj.hn() == null || !c0184hnj.hn().equals(strHnj2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean qor(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar, com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar2) {
        if (hnjVar != null) {
            try {
                if (!TextUtils.isEmpty(hnjVar.qor())) {
                    if (hnjVar2 == null) {
                        return false;
                    }
                    String strDse = hnjVar.dse();
                    String strDse2 = hnjVar2.dse();
                    if ((!TextUtils.isEmpty(strDse2) && !strDse2.equals(strDse)) || hnj(hnjVar.qor(), hnjVar2.qor())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj = hnjVar.hnj();
                    Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj2 = hnjVar2.hnj();
                    if (mapHnj.isEmpty()) {
                        return !mapHnj2.isEmpty();
                    }
                    if (mapHnj2.isEmpty()) {
                        return false;
                    }
                    return hnj(mapHnj, mapHnj2);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                return false;
            }
        }
        return true;
    }

    protected boolean hnj(com.bytedance.sdk.component.adexpress.hnj.qor.hnj.hn hnVar) {
        if (hnVar == null || hnj() == null) {
            return false;
        }
        List<Pair<String, String>> listHn = hnVar.hn();
        if (listHn == null || listHn.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listHn.iterator();
        while (it.hasNext()) {
            File file = new File(hnj(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void hn(List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(hnj(), com.bytedance.sdk.component.utils.sk.hnj(it.next().hnj()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> hnj(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar, com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj = hnjVar.hnj();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mapHnj.size() == 0) {
            if (hnjVar2 != null && hnjVar2.hnj().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj2 = hnjVar2.hnj();
                Iterator<String> it = mapHnj2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar3 = mapHnj2.get(it.next());
                    if (hnjVar3 != null) {
                        arrayList.addAll(hnjVar3.dkl());
                    }
                }
            }
        } else if (hnjVar2 != null && hnjVar2.hnj().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> mapHnj3 = hnjVar2.hnj();
            for (String str : mapHnj.keySet()) {
                com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar4 = mapHnj.get(str);
                com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar5 = mapHnj3.get(str);
                if (hnjVar5 == null && hnjVar4 != null) {
                    arrayList2.addAll(hnjVar4.dkl());
                } else if (hnjVar4 == null && hnjVar5 != null) {
                    arrayList.addAll(hnjVar5.dkl());
                } else if (hnjVar4 != null) {
                    for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : hnjVar4.dkl()) {
                        if (c0184hnj != null && !hnjVar5.dkl().contains(c0184hnj) && c0184hnj.hn() != null && c0184hnj.hnj() != null) {
                            arrayList2.add(c0184hnj);
                        }
                    }
                    for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj2 : hnjVar5.dkl()) {
                        if (c0184hnj2 != null && !hnjVar4.dkl().contains(c0184hnj2)) {
                            arrayList.add(c0184hnj2);
                        }
                    }
                }
            }
        } else if (mapHnj.size() != 0) {
            Iterator<String> it2 = mapHnj.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar6 = mapHnj.get(it2.next());
                if (hnjVar6 != null) {
                    arrayList2.addAll(hnjVar6.dkl());
                }
            }
        }
        if (hnj(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void hn(File file, com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar, String str) {
        if (hnjVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (hnjVar.dkl() != null) {
            Iterator<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> it = hnjVar.dkl().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.sk.hnj(it.next().hnj())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean hnj(List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> list, List<com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj> list2) {
        for (com.bytedance.sdk.component.adexpress.hnj.qor.hnj.C0184hnj c0184hnj : list) {
            String strHnj = c0184hnj.hnj();
            String strHnj2 = com.bytedance.sdk.component.utils.sk.hnj(strHnj);
            File file = new File(hnj(), strHnj2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.dse.hn.hnj hnjVarDkl = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().dkl();
            hnjVarDkl.qor(strHnj);
            hnjVarDkl.hnj(hnj().getAbsolutePath(), strHnj2);
            com.bytedance.sdk.component.dse.hn hnVarHnj = hnjVarDkl.hnj();
            list2.add(c0184hnj);
            if (hnVarHnj == null || !hnVarHnj.dkl() || hnVarHnj.sk() == null || !hnVarHnj.sk().exists()) {
                qor(list2);
                return false;
            }
        }
        return true;
    }

    public boolean hnj(String str) {
        String strHnj = com.bytedance.sdk.component.utils.sk.hnj(str);
        File file = new File(hnj().getAbsoluteFile(), strHnj + ".zip");
        com.bytedance.sdk.component.dse.hn.hnj hnjVarDkl = com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().dkl();
        hnjVarDkl.qor(str);
        hnjVarDkl.hnj(file.getParent(), file.getName());
        com.bytedance.sdk.component.dse.hn hnVarHnj = hnjVarDkl.hnj();
        if (hnVarHnj.dkl() && hnVarHnj.sk() != null && hnVarHnj.sk().exists()) {
            File fileSk = hnVarHnj.sk();
            try {
                nyv.hnj(fileSk.getAbsolutePath(), file.getParent());
                if (!fileSk.exists()) {
                    return true;
                }
                fileSk.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void hnj(int i10) {
        if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().gjv() != null) {
            com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().gjv().hnj(i10);
        }
    }

    public static void hnj(File file, com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar, String str) {
        FileOutputStream fileOutputStream;
        if (hnjVar == null) {
            return;
        }
        String strTa = hnjVar.ta();
        if (TextUtils.isEmpty(strTa)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(strTa.getBytes("utf-8"));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean hnj(Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> map, Map<String, com.bytedance.sdk.component.adexpress.hnj.qor.hnj> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar = map.get(str);
            if (hnjVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar2 = map2.get(str);
            if (hnjVar2 == null) {
                return false;
            }
            if (hnj(hnjVar.qor(), hnjVar2.qor())) {
                return true;
            }
        }
        return false;
    }

    public static boolean hnj(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int length = strArrSplit[i10].length() - strArrSplit2[i10].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i10].compareTo(strArrSplit2[i10]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i10 == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean hnj(com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnjVar, String str) {
        if (hnjVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(hnjVar.qor())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return hnj(hnjVar.qor(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
