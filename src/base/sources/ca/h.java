package ca;

import c1.pGX.geAgcEazw;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.exoplayer2.v0;
import com.google.common.collect.c0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import o4.Wz.OGoz;
import ob.d0;
import ob.u;
import u9.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f9780a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", geAgcEazw.ZNjBS, "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", obFGmWgqyy.ITZBhrDENrg, "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", OGoz.BUExHdzLLxWzxIS, "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    private static ma.e a(int i10, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.V(8);
            String strC = d0Var.C(iQ - 16);
            return new ma.e(C.LANGUAGE_UNDETERMINED, strC, strC);
        }
        u.i("MetadataUtil", "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    private static ma.a b(d0 d0Var) {
        String str;
        int iQ = d0Var.q();
        if (d0Var.q() != 1684108385) {
            u.i("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iB = a.b(d0Var.q());
        if (iB == 13) {
            str = "image/jpeg";
        } else {
            str = iB == 14 ? "image/png" : null;
        }
        if (str == null) {
            u.i("MetadataUtil", "Unrecognized cover art flags: " + iB);
            return null;
        }
        d0Var.V(4);
        int i10 = iQ - 16;
        byte[] bArr = new byte[i10];
        d0Var.l(bArr, 0, i10);
        return new ma.a(str, null, 3, bArr);
    }

    public static ha.a.b c(d0 d0Var) {
        int iF = d0Var.f() + d0Var.q();
        int iQ = d0Var.q();
        int i10 = (iQ >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iQ;
                if (i11 == 6516084) {
                    ma.e eVarA = a(iQ, d0Var);
                    d0Var.U(iF);
                    return eVarA;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    ma.m mVarH = h(iQ, "TIT2", d0Var);
                    d0Var.U(iF);
                    return mVarH;
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    ma.m mVarH2 = h(iQ, "TCOM", d0Var);
                    d0Var.U(iF);
                    return mVarH2;
                }
                if (i11 == 6578553) {
                    ma.m mVarH3 = h(iQ, "TDRC", d0Var);
                    d0Var.U(iF);
                    return mVarH3;
                }
                if (i11 == 4280916) {
                    ma.m mVarH4 = h(iQ, "TPE1", d0Var);
                    d0Var.U(iF);
                    return mVarH4;
                }
                if (i11 == 7630703) {
                    ma.m mVarH5 = h(iQ, "TSSE", d0Var);
                    d0Var.U(iF);
                    return mVarH5;
                }
                if (i11 == 6384738) {
                    ma.m mVarH6 = h(iQ, "TALB", d0Var);
                    d0Var.U(iF);
                    return mVarH6;
                }
                if (i11 == 7108978) {
                    ma.m mVarH7 = h(iQ, "USLT", d0Var);
                    d0Var.U(iF);
                    return mVarH7;
                }
                if (i11 == 6776174) {
                    ma.m mVarH8 = h(iQ, "TCON", d0Var);
                    d0Var.U(iF);
                    return mVarH8;
                }
                if (i11 == 6779504) {
                    ma.m mVarH9 = h(iQ, "TIT1", d0Var);
                    d0Var.U(iF);
                    return mVarH9;
                }
            } else {
                if (iQ == 1735291493) {
                    ma.m mVarG = g(d0Var);
                    d0Var.U(iF);
                    return mVarG;
                }
                if (iQ == 1684632427) {
                    ma.m mVarD = d(iQ, "TPOS", d0Var);
                    d0Var.U(iF);
                    return mVarD;
                }
                if (iQ == 1953655662) {
                    ma.m mVarD2 = d(iQ, "TRCK", d0Var);
                    d0Var.U(iF);
                    return mVarD2;
                }
                if (iQ == 1953329263) {
                    ma.i iVarI = i(iQ, "TBPM", d0Var, true, false);
                    d0Var.U(iF);
                    return iVarI;
                }
                if (iQ == 1668311404) {
                    ma.i iVarI2 = i(iQ, "TCMP", d0Var, true, true);
                    d0Var.U(iF);
                    return iVarI2;
                }
                if (iQ == 1668249202) {
                    ma.a aVarB = b(d0Var);
                    d0Var.U(iF);
                    return aVarB;
                }
                if (iQ == 1631670868) {
                    ma.m mVarH10 = h(iQ, "TPE2", d0Var);
                    d0Var.U(iF);
                    return mVarH10;
                }
                if (iQ == 1936682605) {
                    ma.m mVarH11 = h(iQ, "TSOT", d0Var);
                    d0Var.U(iF);
                    return mVarH11;
                }
                if (iQ == 1936679276) {
                    ma.m mVarH12 = h(iQ, "TSO2", d0Var);
                    d0Var.U(iF);
                    return mVarH12;
                }
                if (iQ == 1936679282) {
                    ma.m mVarH13 = h(iQ, "TSOA", d0Var);
                    d0Var.U(iF);
                    return mVarH13;
                }
                if (iQ == 1936679265) {
                    ma.m mVarH14 = h(iQ, "TSOP", d0Var);
                    d0Var.U(iF);
                    return mVarH14;
                }
                if (iQ == 1936679791) {
                    ma.m mVarH15 = h(iQ, "TSOC", d0Var);
                    d0Var.U(iF);
                    return mVarH15;
                }
                if (iQ == 1920233063) {
                    ma.i iVarI3 = i(iQ, "ITUNESADVISORY", d0Var, false, false);
                    d0Var.U(iF);
                    return iVarI3;
                }
                if (iQ == 1885823344) {
                    ma.i iVarI4 = i(iQ, "ITUNESGAPLESS", d0Var, false, true);
                    d0Var.U(iF);
                    return iVarI4;
                }
                if (iQ == 1936683886) {
                    ma.m mVarH16 = h(iQ, "TVSHOWSORT", d0Var);
                    d0Var.U(iF);
                    return mVarH16;
                }
                if (iQ == 1953919848) {
                    ma.m mVarH17 = h(iQ, "TVSHOW", d0Var);
                    d0Var.U(iF);
                    return mVarH17;
                }
                if (iQ == 757935405) {
                    ma.i iVarE = e(d0Var, iF);
                    d0Var.U(iF);
                    return iVarE;
                }
            }
            u.b("MetadataUtil", "Skipped unknown metadata entry: " + a.a(iQ));
            d0Var.U(iF);
            return null;
        } catch (Throwable th2) {
            d0Var.U(iF);
            throw th2;
        }
    }

    private static ma.m d(int i10, String str, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385 && iQ >= 22) {
            d0Var.V(10);
            int iN = d0Var.N();
            if (iN > 0) {
                String str2 = "" + iN;
                int iN2 = d0Var.N();
                if (iN2 > 0) {
                    str2 = str2 + "/" + iN2;
                }
                return new ma.m(str, null, c0.D(str2));
            }
        }
        u.i("MetadataUtil", "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    private static ma.i e(d0 d0Var, int i10) {
        String strC = null;
        String strC2 = null;
        int i11 = -1;
        int i12 = -1;
        while (d0Var.f() < i10) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            d0Var.V(4);
            if (iQ2 == 1835360622) {
                strC = d0Var.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = d0Var.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i11 = iF;
                    i12 = iQ;
                }
                d0Var.V(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i11 == -1) {
            return null;
        }
        d0Var.U(i11);
        d0Var.V(16);
        return new ma.j(strC, strC2, d0Var.C(i12 - 16));
    }

    public static na.a f(d0 d0Var, int i10, String str) {
        while (true) {
            int iF = d0Var.f();
            if (iF >= i10) {
                return null;
            }
            int iQ = d0Var.q();
            if (d0Var.q() == 1684108385) {
                int iQ2 = d0Var.q();
                int iQ3 = d0Var.q();
                int i11 = iQ - 16;
                byte[] bArr = new byte[i11];
                d0Var.l(bArr, 0, i11);
                return new na.a(str, bArr, iQ3, iQ2);
            }
            d0Var.U(iF + iQ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static ma.m g(d0 d0Var) {
        String str;
        int iJ = j(d0Var);
        if (iJ > 0) {
            String[] strArr = f9780a;
            if (iJ <= strArr.length) {
                str = strArr[iJ - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new ma.m("TCON", null, c0.D(str));
        }
        u.i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static ma.m h(int i10, String str, d0 d0Var) {
        int iQ = d0Var.q();
        if (d0Var.q() == 1684108385) {
            d0Var.V(8);
            return new ma.m(str, null, c0.D(d0Var.C(iQ - 16)));
        }
        u.i("MetadataUtil", "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    private static ma.i i(int i10, String str, d0 d0Var, boolean z10, boolean z11) {
        int iJ = j(d0Var);
        if (z11) {
            iJ = Math.min(1, iJ);
        }
        if (iJ >= 0) {
            return z10 ? new ma.m(str, null, c0.D(Integer.toString(iJ))) : new ma.e(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iJ));
        }
        u.i("MetadataUtil", "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    private static int j(d0 d0Var) {
        d0Var.V(4);
        if (d0Var.q() == 1684108385) {
            d0Var.V(8);
            return d0Var.H();
        }
        u.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, v vVar, v0.b bVar) {
        if (i10 == 1 && vVar.a()) {
            bVar.P(vVar.f54326a).Q(vVar.f54327b);
        }
    }

    public static void l(int i10, ha.a aVar, ha.a aVar2, v0.b bVar, ha.a... aVarArr) {
        ha.a aVar3 = new ha.a(new ha.a.b[0]);
        if (i10 != 1 || aVar == null) {
            aVar = aVar3;
        }
        if (aVar2 != null) {
            for (int i11 = 0; i11 < aVar2.f(); i11++) {
                ha.a.b bVarE = aVar2.e(i11);
                if (bVarE instanceof na.a) {
                    na.a aVar4 = (na.a) bVarE;
                    if (!aVar4.f46944a.equals("com.android.capture.fps")) {
                        aVar = aVar.a(aVar4);
                    } else if (i10 == 2) {
                        aVar = aVar.a(aVar4);
                    }
                }
            }
        }
        for (ha.a aVar5 : aVarArr) {
            aVar = aVar.b(aVar5);
        }
        if (aVar.f() > 0) {
            bVar.Z(aVar);
        }
    }
}
