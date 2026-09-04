package j8;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements b.InterfaceC0639b {
    d() {
    }

    @Override // j8.b.InterfaceC0639b
    public void a(String str) {
        System.loadLibrary(str);
    }

    @Override // j8.b.InterfaceC0639b
    public String b(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // j8.b.InterfaceC0639b
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // j8.b.InterfaceC0639b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !e.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // j8.b.InterfaceC0639b
    public void e(String str) {
        System.load(str);
    }
}
