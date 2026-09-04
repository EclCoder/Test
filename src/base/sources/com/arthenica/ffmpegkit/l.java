package com.arthenica.ffmpegkit;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f11102a;

    static {
        ArrayList arrayList = new ArrayList();
        f11102a = arrayList;
        arrayList.add("dav1d");
        arrayList.add("fontconfig");
        arrayList.add("freetype");
        arrayList.add("fribidi");
        arrayList.add("gmp");
        arrayList.add("gnutls");
        arrayList.add("kvazaar");
        arrayList.add("mp3lame");
        arrayList.add("libass");
        arrayList.add("iconv");
        arrayList.add("libilbc");
        arrayList.add("libtheora");
        arrayList.add("libvidstab");
        arrayList.add("libvorbis");
        arrayList.add("libvpx");
        arrayList.add("libwebp");
        arrayList.add("libxml2");
        arrayList.add("opencore-amr");
        arrayList.add("openh264");
        arrayList.add("openssl");
        arrayList.add("opus");
        arrayList.add("rubberband");
        arrayList.add("sdl2");
        arrayList.add("shine");
        arrayList.add("snappy");
        arrayList.add("soxr");
        arrayList.add("speex");
        arrayList.add("srt");
        arrayList.add("tesseract");
        arrayList.add("twolame");
        arrayList.add("x264");
        arrayList.add("x265");
        arrayList.add("xvid");
        arrayList.add("zimg");
    }

    public static List a() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        for (String str : f11102a) {
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String b() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        List listA = a();
        boolean zContains = listA.contains("speex");
        boolean zContains2 = listA.contains("fribidi");
        boolean zContains3 = listA.contains("gnutls");
        boolean zContains4 = listA.contains("xvid");
        boolean z15 = true;
        boolean z16 = false;
        if (!zContains || !zContains2) {
            if (zContains) {
                z11 = true;
                z10 = false;
                z13 = false;
            } else {
                if (zContains2) {
                    z10 = true;
                    z11 = false;
                } else if (!zContains4) {
                    if (zContains3) {
                        z12 = true;
                        z10 = false;
                        z11 = false;
                        z13 = false;
                        z15 = false;
                    } else {
                        z10 = false;
                        z11 = false;
                    }
                    z14 = z15;
                } else if (zContains3) {
                    z13 = true;
                    z10 = false;
                    z11 = false;
                    z12 = false;
                    z15 = z12;
                    z14 = z15;
                } else {
                    z14 = true;
                    z10 = false;
                    z11 = false;
                    z13 = false;
                    z12 = false;
                    z15 = false;
                }
                z13 = z11;
            }
            z12 = z13;
            z15 = z12;
            z14 = z15;
        } else if (zContains4) {
            z10 = false;
            z11 = false;
            z13 = false;
            z12 = false;
            z14 = false;
        } else {
            z10 = false;
            z11 = false;
            z13 = false;
            z12 = false;
            z14 = false;
            z16 = true;
            z15 = false;
        }
        boolean z17 = z10;
        boolean z18 = z11;
        boolean z19 = z13;
        boolean z20 = z12;
        boolean z21 = z16;
        boolean z22 = z14;
        if (z15) {
            return (listA.contains("dav1d") && listA.contains("fontconfig") && listA.contains("freetype") && listA.contains("fribidi") && listA.contains("gmp") && listA.contains("gnutls") && listA.contains("kvazaar") && listA.contains("mp3lame") && listA.contains("libass") && listA.contains("iconv") && listA.contains("libilbc") && listA.contains("libtheora") && listA.contains("libvidstab") && listA.contains("libvorbis") && listA.contains("libvpx") && listA.contains("libwebp") && listA.contains("libxml2") && listA.contains("opencore-amr") && listA.contains("opus") && listA.contains("shine") && listA.contains("snappy") && listA.contains("soxr") && listA.contains("speex") && listA.contains("twolame") && listA.contains("x264") && listA.contains("x265") && listA.contains("xvid") && listA.contains("zimg")) ? "full-gpl" : "custom";
        }
        if (z21) {
            return (listA.contains("dav1d") && listA.contains("fontconfig") && listA.contains("freetype") && listA.contains("fribidi") && listA.contains("gmp") && listA.contains("gnutls") && listA.contains("kvazaar") && listA.contains("mp3lame") && listA.contains("libass") && listA.contains("iconv") && listA.contains("libilbc") && listA.contains("libtheora") && listA.contains("libvorbis") && listA.contains("libvpx") && listA.contains("libwebp") && listA.contains("libxml2") && listA.contains("opencore-amr") && listA.contains("opus") && listA.contains("shine") && listA.contains("snappy") && listA.contains("soxr") && listA.contains("speex") && listA.contains("twolame") && listA.contains("zimg")) ? "full" : "custom";
        }
        if (z17) {
            return (listA.contains("dav1d") && listA.contains("fontconfig") && listA.contains("freetype") && listA.contains("fribidi") && listA.contains("kvazaar") && listA.contains("libass") && listA.contains("iconv") && listA.contains("libtheora") && listA.contains("libvpx") && listA.contains("libwebp") && listA.contains("snappy") && listA.contains("zimg")) ? MimeTypes.BASE_TYPE_VIDEO : "custom";
        }
        if (z18) {
            return (listA.contains("mp3lame") && listA.contains("libilbc") && listA.contains("libvorbis") && listA.contains("opencore-amr") && listA.contains("opus") && listA.contains("shine") && listA.contains("soxr") && listA.contains("speex") && listA.contains("twolame")) ? MimeTypes.BASE_TYPE_AUDIO : "custom";
        }
        if (z19) {
            return (listA.contains("gmp") && listA.contains("gnutls") && listA.contains("libvidstab") && listA.contains("x264") && listA.contains("x265") && listA.contains("xvid")) ? "https-gpl" : "custom";
        }
        if (z20) {
            return (listA.contains("gmp") && listA.contains("gnutls")) ? "https" : "custom";
        }
        if (z22) {
            return (listA.contains("libvidstab") && listA.contains("x264") && listA.contains("x265") && listA.contains("xvid")) ? "min-gpl" : "custom";
        }
        return listA.size() == 0 ? "min" : "custom";
    }
}
