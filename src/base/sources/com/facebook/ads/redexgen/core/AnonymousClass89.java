package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.89, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("Exo version is final but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
public final class AnonymousClass89 implements InterfaceC2413kS {
    public static byte[] A03;
    public static String[] A04 = {"jtWHdC1JS00IQCACyTEvOJEMPrvoo3Ob", "eCCt1HwS4IToKXyi1WzLFL1R4PlgsDM4", "yXgy4dLxj37Ni2Ba12KifyhgeRBIXCXp", "5p7nRT0g4n3u8StY", "28aCkGMBHBRgMUJ0i4knnGO", "XAmyqmpuCXa4X38XkweYk7F1knbiAlXr", "krkFdswQPRExlipS29WIEjh8hbH7SBjj", "jb"};

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public long A00;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final long A01;

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public final TreeSet<MZ> A02 = new TreeSet<>(new Comparator() { // from class: com.facebook.ads.redexgen.X.Mn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AnonymousClass89.A00((MZ) obj, (MZ) obj2);
        }
    });

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{46, 61, 34, 40, 63, 8, 42, 40, 35, 46};
    }

    static {
        A02();
    }

    public AnonymousClass89(long j10) {
        this.A01 = j10;
    }

    @MetaExoPlayerCustomization("Exo version is private but in Meta code HeroLeastRecentlyUsedCacheEvictor extends this")
    public static int A00(MZ mz, MZ mz2) {
        if (mz.A00 - mz2.A00 == 0) {
            return mz.compareTo(mz2);
        }
        return mz.A00 < mz2.A00 ? -1 : 1;
    }

    private void A03(MP mp2, long j10) {
        AnonymousClass54.A02(A01(0, 10, 87));
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            MZ mzFirst = this.A02.first();
            if (A04[1].charAt(10) != 'T') {
                throw new RuntimeException();
            }
            A04[4] = "DjrmhsDHxGC2SVigK1e7Rl2";
            mp2.AIV(mzFirst);
        }
        AnonymousClass54.A00();
    }

    @Override // com.facebook.ads.redexgen.core.MO
    public final void AG2(MP mp2, MZ mz) {
        this.A02.add(mz);
        this.A00 += mz.A01;
        A03(mp2, 0L);
    }

    @Override // com.facebook.ads.redexgen.core.MO
    public final void AG3(MP mp2, MZ mz) {
        this.A02.remove(mz);
        this.A00 -= mz.A01;
    }

    @Override // com.facebook.ads.redexgen.core.MO
    public final void AG4(MP mp2, MZ mz, MZ mz2) {
        AG3(mp2, mz);
        AG2(mp2, mz2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2413kS
    public final void AG5(MP mp2, String str, long j10, long j11) {
        if (j11 != -1) {
            A03(mp2, j11);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2413kS
    public final boolean AIj() {
        return true;
    }
}
