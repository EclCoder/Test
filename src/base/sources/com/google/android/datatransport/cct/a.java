package com.google.android.datatransport.cct;

import c9.g;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f16381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f16382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f16383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f16384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f16385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f16386h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16388b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f16381c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f16382d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f16383e = strA3;
        f16384f = Collections.unmodifiableSet(new HashSet(Arrays.asList(a9.b.b("proto"), a9.b.b("json"))));
        f16385g = new a(strA, null);
        f16386h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f16387a = str;
        this.f16388b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // c9.g
    public Set a() {
        return f16384f;
    }

    public byte[] b() {
        String str = this.f16388b;
        if (str == null && this.f16387a == null) {
            return null;
        }
        String str2 = this.f16387a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String d() {
        return this.f16388b;
    }

    public String e() {
        return this.f16387a;
    }

    @Override // c9.f
    public byte[] getExtras() {
        return b();
    }

    @Override // c9.f
    public String getName() {
        return "cct";
    }
}
