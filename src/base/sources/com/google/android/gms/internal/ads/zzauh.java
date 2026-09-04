package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzauh extends zzate {
    private final Object zza;
    private final zzatj zzb;

    public zzauh(int i10, String str, zzatj zzatjVar, zzati zzatiVar) {
        super(i10, str, zzatiVar);
        this.zza = new Object();
        this.zzb = zzatjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzate
    protected final zzatk zzr(zzata zzataVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzataVar.zzb;
            Map map = zzataVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzataVar.zzb);
        }
        return zzatk.zza(str, zzaub.zza(zzataVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzate
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzatj zzatjVar;
        synchronized (this.zza) {
            zzatjVar = this.zzb;
        }
        zzatjVar.zza(str);
    }
}
