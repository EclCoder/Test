package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbya extends zzbyg {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcku zzj;
    private final Activity zzk;
    private zzcne zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbyh zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbya(zzcku zzckuVar, zzbyh zzbyhVar) {
        super(zzckuVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzckuVar;
        this.zzk = zzckuVar.zzj();
        this.zzo = zzbyhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzml)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmm)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmn)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcku zzckuVar = this.zzj;
                    viewGroup2.addView((View) zzckuVar);
                    zzckuVar.zzaf(this.zzl);
                } catch (IllegalStateException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcku zzckuVar2 = this.zzj;
                viewGroup3.addView((View) zzckuVar2);
                zzckuVar2.zzaf(this.zzl);
            }
        }
        if (z10) {
            zzk("default");
            zzbyh zzbyhVar = this.zzo;
            if (zzbyhVar != null) {
                zzbyhVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:123:0x0246 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x024d A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x026a A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0276 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02aa A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0317  */
    /* JADX WARN: Code duplicated, block: B:138:0x031f A[Catch: all -> 0x0014, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0326  */
    /* JADX WARN: Code duplicated, block: B:142:0x032e A[Catch: all -> 0x0014, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0335  */
    /* JADX WARN: Code duplicated, block: B:146:0x033d A[Catch: all -> 0x0014, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0344  */
    /* JADX WARN: Code duplicated, block: B:150:0x034c A[Catch: all -> 0x0014, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0353  */
    /* JADX WARN: Code duplicated, block: B:154:0x035b A[Catch: all -> 0x0014, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0362  */
    /* JADX WARN: Code duplicated, block: B:158:0x036a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0370 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x03b3 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0426 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01cb A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0120, B:63:0x012c, B:123:0x0246, B:124:0x024b, B:126:0x024d, B:128:0x026a, B:130:0x0276, B:132:0x02ad, B:138:0x031f, B:161:0x0376, B:162:0x038e, B:163:0x03ab, B:165:0x03b3, B:166:0x03ba, B:167:0x03e1, B:170:0x03e4, B:172:0x0412, B:173:0x0424, B:142:0x032e, B:146:0x033d, B:150:0x034c, B:154:0x035b, B:159:0x036c, B:160:0x0370, B:131:0x02aa, B:175:0x0426, B:176:0x042b, B:65:0x0136, B:67:0x013a, B:72:0x014d, B:98:0x01d8, B:100:0x01db, B:102:0x01df, B:76:0x0165, B:77:0x0170, B:82:0x0181, B:86:0x0194, B:90:0x01a4, B:91:0x01ac, B:95:0x01b8, B:96:0x01cb, B:106:0x01e8, B:107:0x01f7, B:113:0x021d, B:119:0x022d, B:116:0x0223, B:118:0x022b, B:110:0x0215, B:112:0x021b, B:120:0x0232, B:121:0x023b, B:178:0x042d, B:179:0x0432, B:181:0x0434, B:182:0x0439), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        int[] iArr;
        int iZzE;
        int iZzE2;
        ViewParent parent;
        ViewGroup viewGroup;
        PopupWindow popupWindow;
        RelativeLayout.LayoutParams layoutParams;
        String str;
        int i10;
        int i11;
        zzbyh zzbyhVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        synchronized (this.zzi) {
            try {
                Activity activity = this.zzk;
                if (activity == null) {
                    zzg("Not an activity context. Cannot resize.");
                    return;
                }
                zzcku zzckuVar = this.zzj;
                if (zzckuVar.zzN() == null) {
                    zzg("Webview is not yet available, size is not set.");
                    return;
                }
                if (zzckuVar.zzN().zzg()) {
                    zzg("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (zzckuVar.zzW()) {
                    zzg("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zze = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzS((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str2 = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str2)) {
                    this.zza = str2;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzg("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = activity.getWindow();
                if (window != null && window.getDecorView() != null) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] iArrZzaa = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    int[] iArrZzW = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                    int i18 = iArrZzaa[0];
                    int i19 = iArrZzaa[1];
                    int i20 = this.zzh;
                    if (i20 < 50 || i20 > i18) {
                        int i21 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                    } else {
                        int i22 = this.zze;
                        if (i22 < 50 || i22 > i19) {
                            int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                        } else {
                            if (i22 != i19 || i20 != i18) {
                                boolean z10 = this.zzb;
                                if (z10) {
                                    String str3 = this.zza;
                                    switch (str3) {
                                        case "center":
                                            i14 = ((this.zzc + this.zzf) + (i20 >> 1)) - 25;
                                            i15 = ((this.zzd + this.zzg) + (i22 >> 1)) - 25;
                                            i12 = i14;
                                            i16 = i15;
                                            break;
                                        case "top-left":
                                            i12 = this.zzc + this.zzf;
                                            i13 = this.zzd;
                                        case "bottom-left":
                                            i14 = this.zzc + this.zzf;
                                            i17 = this.zzd;
                                            i15 = ((i17 + this.zzg) + i22) - 50;
                                            i12 = i14;
                                            i16 = i15;
                                            break;
                                        case "bottom-right":
                                            i14 = ((this.zzc + this.zzf) + i20) - 50;
                                            i17 = this.zzd;
                                            i15 = ((i17 + this.zzg) + i22) - 50;
                                            i12 = i14;
                                            i16 = i15;
                                            break;
                                        case "bottom-center":
                                            i14 = ((this.zzc + this.zzf) + (i20 >> 1)) - 25;
                                            i17 = this.zzd;
                                            i15 = ((i17 + this.zzg) + i22) - 50;
                                            i12 = i14;
                                            i16 = i15;
                                            break;
                                        case "top-center":
                                            i12 = ((this.zzc + this.zzf) + (i20 >> 1)) - 25;
                                            i16 = this.zzd + this.zzg;
                                            break;
                                        default:
                                            if (str3.equals(TtmlNode.CENTER)) {
                                                i14 = ((this.zzc + this.zzf) + (i20 >> 1)) - 25;
                                                i15 = ((this.zzd + this.zzg) + (i22 >> 1)) - 25;
                                                i12 = i14;
                                                i16 = i15;
                                                break;
                                            }
                                            i12 = ((this.zzc + this.zzf) + i20) - 50;
                                            i13 = this.zzd;
                                            i16 = i13 + this.zzg;
                                            break;
                                    }
                                    if (i12 < 0 || i12 + 50 > i18 || i16 < iArrZzW[0] || i16 + 50 > iArrZzW[1]) {
                                    }
                                    if (iArr == null) {
                                        zzg("Resize location out of screen or close button is not visible.");
                                        return;
                                    }
                                    com.google.android.gms.ads.internal.client.zzay.zza();
                                    iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                                    com.google.android.gms.ads.internal.client.zzay.zza();
                                    iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                                    parent = ((View) zzckuVar).getParent();
                                    if (!(parent instanceof ViewGroup)) {
                                        zzg("Webview is detached, probably in the middle of a resize or expand.");
                                        return;
                                    }
                                    viewGroup = (ViewGroup) parent;
                                    viewGroup.removeView((View) zzckuVar);
                                    popupWindow = this.zzp;
                                    if (popupWindow == null) {
                                        this.zzr = viewGroup;
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        ((View) zzckuVar).setDrawingCacheEnabled(true);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzckuVar).getDrawingCache());
                                        ((View) zzckuVar).setDrawingCacheEnabled(false);
                                        ImageView imageView = new ImageView(activity);
                                        this.zzm = imageView;
                                        imageView.setImageBitmap(bitmapCreateBitmap);
                                        this.zzl = zzckuVar.zzN();
                                        this.zzr.addView(this.zzm);
                                    } else {
                                        popupWindow.dismiss();
                                    }
                                    RelativeLayout relativeLayout = new RelativeLayout(activity);
                                    this.zzq = relativeLayout;
                                    relativeLayout.setBackgroundColor(0);
                                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzE, iZzE2, false);
                                    this.zzp = popupWindow2;
                                    popupWindow2.setOutsideTouchable(false);
                                    this.zzp.setTouchable(true);
                                    this.zzp.setClippingEnabled(!this.zzb);
                                    this.zzq.addView((View) zzckuVar, -1, -1);
                                    this.zzn = new LinearLayout(activity);
                                    com.google.android.gms.ads.internal.client.zzay.zza();
                                    int iZzE3 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50);
                                    com.google.android.gms.ads.internal.client.zzay.zza();
                                    layoutParams = new RelativeLayout.LayoutParams(iZzE3, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50));
                                    str = this.zza;
                                    switch (str.hashCode()) {
                                        case -1364013995:
                                            if (!str.equals(TtmlNode.CENTER)) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(13);
                                            }
                                            break;
                                        case -1012429441:
                                            if (!str.equals("top-left")) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(9);
                                            }
                                            break;
                                        case -655373719:
                                            if (!str.equals("bottom-left")) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(9);
                                            }
                                            break;
                                        case 1163912186:
                                            if (!str.equals("bottom-right")) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(11);
                                            }
                                            break;
                                        case 1288627767:
                                            if (!str.equals("bottom-center")) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(14);
                                            }
                                            break;
                                        case 1755462605:
                                            if (!str.equals("top-center")) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(14);
                                            }
                                            break;
                                        default:
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                            break;
                                    }
                                    this.zzn.setOnClickListener(new zzbxy(this));
                                    this.zzn.setContentDescription("Close button");
                                    this.zzq.addView(this.zzn, layoutParams);
                                    try {
                                        PopupWindow popupWindow3 = this.zzp;
                                        View decorView = window.getDecorView();
                                        com.google.android.gms.ads.internal.client.zzay.zza();
                                        int iZzE4 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                                        com.google.android.gms.ads.internal.client.zzay.zza();
                                        popupWindow3.showAtLocation(decorView, 0, iZzE4, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                                        i10 = iArr[0];
                                        i11 = iArr[1];
                                        zzbyhVar = this.zzo;
                                        if (zzbyhVar != null) {
                                            zzbyhVar.zza(i10, i11, this.zzh, this.zze);
                                        }
                                        this.zzj.zzaf(zzcne.zzc(iZzE, iZzE2));
                                        int i24 = iArr[0];
                                        int i25 = iArr[1];
                                        com.google.android.gms.ads.internal.zzt.zzc();
                                        zzi(i24, i25 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                                        zzk("resized");
                                        return;
                                    } catch (RuntimeException e10) {
                                        String message = e10.getMessage();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                                        sb2.append("Cannot show popup window: ");
                                        sb2.append(message);
                                        zzg(sb2.toString());
                                        RelativeLayout relativeLayout2 = this.zzq;
                                        zzcku zzckuVar2 = this.zzj;
                                        relativeLayout2.removeView((View) zzckuVar2);
                                        ViewGroup viewGroup2 = this.zzr;
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(this.zzm);
                                            this.zzr.addView((View) zzckuVar2);
                                            zzckuVar2.zzaf(this.zzl);
                                        }
                                        return;
                                    }
                                }
                                if (z10) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                } else {
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    int[] iArrZzaa2 = com.google.android.gms.ads.internal.util.zzs.zzaa(activity);
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    int[] iArrZzW2 = com.google.android.gms.ads.internal.util.zzs.zzW(activity);
                                    int i26 = iArrZzaa2[0];
                                    int i27 = this.zzc + this.zzf;
                                    int i28 = this.zzd + this.zzg;
                                    if (i27 < 0) {
                                        i27 = 0;
                                    } else {
                                        int i29 = this.zzh;
                                        if (i27 + i29 > i26) {
                                            i27 = i26 - i29;
                                        }
                                    }
                                    int i30 = iArrZzW2[0];
                                    if (i28 < i30) {
                                        i28 = i30;
                                    } else {
                                        int i31 = this.zze;
                                        int i32 = i28 + i31;
                                        int i33 = iArrZzW2[1];
                                        if (i32 > i33) {
                                            i28 = i33 - i31;
                                        }
                                    }
                                    iArr = new int[]{i27, i28};
                                }
                                if (iArr == null) {
                                    zzg("Resize location out of screen or close button is not visible.");
                                    return;
                                }
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                                parent = ((View) zzckuVar).getParent();
                                if (!(parent instanceof ViewGroup)) {
                                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                viewGroup = (ViewGroup) parent;
                                viewGroup.removeView((View) zzckuVar);
                                popupWindow = this.zzp;
                                if (popupWindow == null) {
                                    this.zzr = viewGroup;
                                    com.google.android.gms.ads.internal.zzt.zzc();
                                    ((View) zzckuVar).setDrawingCacheEnabled(true);
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(((View) zzckuVar).getDrawingCache());
                                    ((View) zzckuVar).setDrawingCacheEnabled(false);
                                    ImageView imageView2 = new ImageView(activity);
                                    this.zzm = imageView2;
                                    imageView2.setImageBitmap(bitmapCreateBitmap2);
                                    this.zzl = zzckuVar.zzN();
                                    this.zzr.addView(this.zzm);
                                } else {
                                    popupWindow.dismiss();
                                }
                                RelativeLayout relativeLayout3 = new RelativeLayout(activity);
                                this.zzq = relativeLayout3;
                                relativeLayout3.setBackgroundColor(0);
                                this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                                com.google.android.gms.ads.internal.zzt.zzc();
                                PopupWindow popupWindow4 = new PopupWindow((View) this.zzq, iZzE, iZzE2, false);
                                this.zzp = popupWindow4;
                                popupWindow4.setOutsideTouchable(false);
                                this.zzp.setTouchable(true);
                                this.zzp.setClippingEnabled(!this.zzb);
                                this.zzq.addView((View) zzckuVar, -1, -1);
                                this.zzn = new LinearLayout(activity);
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                int iZzE5 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50);
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                layoutParams = new RelativeLayout.LayoutParams(iZzE5, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50));
                                str = this.zza;
                                switch (str.hashCode()) {
                                    case -1364013995:
                                        if (!str.equals(TtmlNode.CENTER)) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(13);
                                        }
                                        break;
                                    case -1012429441:
                                        if (!str.equals("top-left")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(9);
                                        }
                                        break;
                                    case -655373719:
                                        if (!str.equals("bottom-left")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(9);
                                        }
                                        break;
                                    case 1163912186:
                                        if (!str.equals("bottom-right")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(11);
                                        }
                                        break;
                                    case 1288627767:
                                        if (!str.equals("bottom-center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(14);
                                        }
                                        break;
                                    case 1755462605:
                                        if (!str.equals("top-center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(14);
                                        }
                                        break;
                                    default:
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(11);
                                        break;
                                }
                                this.zzn.setOnClickListener(new zzbxy(this));
                                this.zzn.setContentDescription("Close button");
                                this.zzq.addView(this.zzn, layoutParams);
                                PopupWindow popupWindow5 = this.zzp;
                                View decorView2 = window.getDecorView();
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                int iZzE6 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                                com.google.android.gms.ads.internal.client.zzay.zza();
                                popupWindow5.showAtLocation(decorView2, 0, iZzE6, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                                i10 = iArr[0];
                                i11 = iArr[1];
                                zzbyhVar = this.zzo;
                                if (zzbyhVar != null) {
                                    zzbyhVar.zza(i10, i11, this.zzh, this.zze);
                                }
                                this.zzj.zzaf(zzcne.zzc(iZzE, iZzE2));
                                int i210 = iArr[0];
                                int i211 = iArr[1];
                                com.google.android.gms.ads.internal.zzt.zzc();
                                zzi(i210, i211 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                                zzk("resized");
                                return;
                            }
                            int i34 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                        }
                    }
                    iArr = null;
                    if (iArr == null) {
                        zzg("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    iZzE = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zzh);
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    iZzE2 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, this.zze);
                    parent = ((View) zzckuVar).getParent();
                    if (!(parent instanceof ViewGroup)) {
                        zzg("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) zzckuVar);
                    popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        com.google.android.gms.ads.internal.zzt.zzc();
                        ((View) zzckuVar).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(((View) zzckuVar).getDrawingCache());
                        ((View) zzckuVar).setDrawingCacheEnabled(false);
                        ImageView imageView3 = new ImageView(activity);
                        this.zzm = imageView3;
                        imageView3.setImageBitmap(bitmapCreateBitmap3);
                        this.zzl = zzckuVar.zzN();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout4 = new RelativeLayout(activity);
                    this.zzq = relativeLayout4;
                    relativeLayout4.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                    com.google.android.gms.ads.internal.zzt.zzc();
                    PopupWindow popupWindow6 = new PopupWindow((View) this.zzq, iZzE, iZzE2, false);
                    this.zzp = popupWindow6;
                    popupWindow6.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    this.zzq.addView((View) zzckuVar, -1, -1);
                    this.zzn = new LinearLayout(activity);
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    int iZzE7 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50);
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    layoutParams = new RelativeLayout.LayoutParams(iZzE7, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, 50));
                    str = this.zza;
                    switch (str.hashCode()) {
                        case -1364013995:
                            if (!str.equals(TtmlNode.CENTER)) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(13);
                            }
                            break;
                        case -1012429441:
                            if (!str.equals("top-left")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(10);
                                layoutParams.addRule(9);
                            }
                            break;
                        case -655373719:
                            if (!str.equals("bottom-left")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(9);
                            }
                            break;
                        case 1163912186:
                            if (!str.equals("bottom-right")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(11);
                            }
                            break;
                        case 1288627767:
                            if (!str.equals("bottom-center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(12);
                                layoutParams.addRule(14);
                            }
                            break;
                        case 1755462605:
                            if (!str.equals("top-center")) {
                                layoutParams.addRule(10);
                                layoutParams.addRule(11);
                            } else {
                                layoutParams.addRule(10);
                                layoutParams.addRule(14);
                            }
                            break;
                        default:
                            layoutParams.addRule(10);
                            layoutParams.addRule(11);
                            break;
                    }
                    this.zzn.setOnClickListener(new zzbxy(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    PopupWindow popupWindow7 = this.zzp;
                    View decorView3 = window.getDecorView();
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    int iZzE8 = com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[0]);
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    popupWindow7.showAtLocation(decorView3, 0, iZzE8, com.google.android.gms.ads.internal.util.client.zzf.zzE(activity, iArr[1]));
                    i10 = iArr[0];
                    i11 = iArr[1];
                    zzbyhVar = this.zzo;
                    if (zzbyhVar != null) {
                        zzbyhVar.zza(i10, i11, this.zzh, this.zze);
                    }
                    this.zzj.zzaf(zzcne.zzc(iZzE, iZzE2));
                    int i212 = iArr[0];
                    int i213 = iArr[1];
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzi(i212, i213 - com.google.android.gms.ads.internal.util.zzs.zzW(this.zzk)[0], this.zzh, this.zze);
                    zzk("resized");
                    return;
                }
                zzg("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmk)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z10);
                    } else {
                        zzcfr.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxz
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf(z10);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }
}
