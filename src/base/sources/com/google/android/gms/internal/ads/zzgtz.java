package com.google.android.gms.internal.ads;

import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public enum zzgtz {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR(trPLwhKZgZ.WvkaNapJhJmv),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS(HqKnbV.PLUd),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");

    private final String zzC;

    zzgtz(String str) {
        this.zzC = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = this.zzC;
        String property = System.getProperty(str);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(property).length());
        sb2.append(str);
        sb2.append("=");
        sb2.append(property);
        return sb2.toString();
    }

    public final String zza() {
        return System.getProperty(this.zzC);
    }
}
