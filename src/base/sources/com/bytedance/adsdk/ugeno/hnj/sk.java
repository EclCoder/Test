package com.bytedance.adsdk.ugeno.hnj;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import f8.Ygx.FuoITeVPeXAj;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public enum sk {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", "float"),
    TRANSLATE_Y("translateY", "translationY", "float"),
    ROTATE_X("rotateX", "rotationX", SVWsZyNSAChGIA.RKFmCUvsDart),
    ROTATE_Y("rotateY", "rotationY", "float"),
    ROTATE_Z("rotateZ", "rotation", "float"),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", "float"),
    SCALE_Y("scaleY", "scaleY", "float"),
    ALPHA("opacity", "alpha", "float"),
    BACKGROUND_COLOR(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", "float"),
    RIPPLE("ripple", "ripple", "float"),
    SHINE("shine", "shine", dOIDCKnIR.InRfbP);


    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private final String f12339fc;
    private final String jip;
    private final String uua;

    sk(String str, String str2, String str3) {
        this.f12339fc = str;
        this.jip = str2;
        this.uua = str3;
    }

    public String hn() {
        return this.jip;
    }

    public String hnj() {
        return this.f12339fc;
    }

    public String qor() {
        return this.uua;
    }

    public static sk hnj(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    b10 = 0;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    b10 = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 2;
                }
                break;
            case -930826704:
                if (str.equals("ripple")) {
                    b10 = 3;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 4;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 5;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    b10 = 6;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    b10 = 7;
                }
                break;
            case 1287124693:
                if (str.equals(FuoITeVPeXAj.Fkxsh)) {
                    b10 = 8;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 9;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    b10 = 10;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    b10 = 11;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    b10 = 12;
                }
                break;
        }
        switch (b10) {
            case 0:
                return TRANSLATE_X;
            case 1:
                return TRANSLATE_Y;
            case 2:
                return ALPHA;
            case 3:
                return RIPPLE;
            case 4:
                return SCALE_X;
            case 5:
                return SCALE_Y;
            case 6:
                return SCALE;
            case 7:
                return TRANSLATE;
            case 8:
                return BACKGROUND_COLOR;
            case 9:
                return BORDER_RADIUS;
            case 10:
                return ROTATE_X;
            case 11:
                return ROTATE_Y;
            case 12:
                return ROTATE_Z;
            default:
                return TRANSLATE_X;
        }
    }
}
