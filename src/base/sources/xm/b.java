package xm;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f56882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f56884d;

    public b(PackageInfo packageInfo, boolean z10) {
        this(packageInfo.packageName, b(packageInfo.signatures), packageInfo.versionName, z10);
    }

    public static String a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set b(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(a(signature));
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (this.f56881a.equals(bVar.f56881a) && this.f56883c.equals(bVar.f56883c) && this.f56884d == bVar.f56884d && this.f56882b.equals(bVar.f56882b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f56881a.hashCode() * 92821) + this.f56883c.hashCode()) * 92821) + (this.f56884d.booleanValue() ? 1 : 0);
        Iterator it = this.f56882b.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 92821) + ((String) it.next()).hashCode();
        }
        return iHashCode;
    }

    public b(String str, Set set, String str2, boolean z10) {
        this.f56881a = str;
        this.f56882b = set;
        this.f56883c = str2;
        this.f56884d = Boolean.valueOf(z10);
    }
}
