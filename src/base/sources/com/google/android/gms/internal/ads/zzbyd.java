package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbyd extends zzbyg {
    private final Map zza;
    private final Context zzb;

    public zzbyd(zzcku zzckuVar, Map map) {
        super(zzckuVar, "storePicture");
        this.zza = map;
        this.zzb = zzckuVar.zzj();
    }

    final /* synthetic */ Context zzb() {
        return this.zzb;
    }

    public final void zza() {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbhx(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get(KPtaxpyICj.yxRfdwtggijvm);
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        builderZzN.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.f19214s1) : "Save image");
        builderZzN.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.f19215s2) : "Allow Ad to store image in Picture gallery?");
        builderZzN.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f19216s3) : "Accept", new zzbyb(this, str, lastPathSegment));
        builderZzN.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f19217s4) : "Decline", new zzbyc(this));
        builderZzN.create().show();
    }
}
