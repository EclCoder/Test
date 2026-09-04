package com.bytedance.sdk.openadsdk.hn;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends hnj {
    private volatile boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14501hn;
    private int qor;

    public hn(int i10, int i11) {
        this.f14501hn = 15;
        this.qor = 3;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f14501hn = i10;
        this.qor = i11;
    }

    private void gjv(List<File> list) {
        long jHn;
        int size;
        boolean zHnj;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zHnj = hnj((jHn = hn(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zHnj) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jHn -= length;
                            }
                            if (hnj(file2, jHn, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void qor(List<File> list) {
        long jHn = hn(list);
        int size = list.size();
        if (hnj(jHn, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jHn -= length;
            }
            if (hnj(file, jHn, size)) {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hn.hnj
    protected boolean hnj(long j10, int i10) {
        return i10 <= this.f14501hn;
    }

    @Override // com.bytedance.sdk.openadsdk.hn.hnj
    protected boolean hnj(File file, long j10, int i10) {
        return i10 <= this.qor;
    }

    @Override // com.bytedance.sdk.openadsdk.hn.hnj
    protected void hnj(List<File> list) {
        if (this.gjv) {
            gjv(list);
            this.gjv = false;
        } else {
            qor(list);
        }
    }

    public hn(int i10, int i11, boolean z10) {
        this.f14501hn = 15;
        this.qor = 3;
        if (i10 > 0) {
            this.f14501hn = i10;
            this.qor = i11;
            this.gjv = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
