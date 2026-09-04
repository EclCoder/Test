package bm;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends b {
    public static int d(char c10) {
        int iB = b.b(c10, 10);
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    public static final boolean e(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean f(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }
}
