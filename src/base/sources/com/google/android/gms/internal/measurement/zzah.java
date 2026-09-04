package com.google.android.gms.internal.measurement;

import f8.Ygx.FuoITeVPeXAj;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import tn.xQIL.Saucuwx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzah implements zzao {
    private final Double zza;

    public zzah(Double d10) {
        if (d10 == null) {
            this.zza = Double.valueOf(Double.NaN);
        } else {
            this.zza = d10;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzah) {
            return this.zza.equals(((zzah) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzcG(String str, zzg zzgVar, List list) {
        if ("toString".equals(str)) {
            return new zzas(zzc());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzc(), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        Double d10 = this.zza;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        return new zzah(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        Double d10 = this.zza;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalA = com.bytedance.adsdk.hnj.a.a(BigDecimal.valueOf(d10.doubleValue()));
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalA.scale() > 0 ? bigDecimalA.precision() : bigDecimalA.scale()) - 1);
        String str = decimalFormat.format(bigDecimalA);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace(Saucuwx.EHUkbOGlVC, FuoITeVPeXAj.JLGEND).replace("E", "e+") : bigDecimalA.toPlainString();
    }
}
