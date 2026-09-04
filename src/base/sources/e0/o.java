package e0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.List;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class o extends q {
    private Font i(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iN = n(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iN2 = n(fontStyle, font2.getStyle());
            if (iN2 < iN) {
                font = font2;
                iN = iN2;
            }
        }
        return font;
    }

    private Font j(CancellationSignal cancellationSignal, k0.i.b bVar, ContentResolver contentResolver) {
        return bVar.h() ? m(bVar) : l(cancellationSignal, bVar, contentResolver);
    }

    private Font l(CancellationSignal cancellationSignal, k0.i.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), CampaignEx.JSON_KEY_AD_R, cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.f()).setSlant(bVar.g() ? 1 : 0).setTtcIndex(bVar.c());
                if (!TextUtils.isEmpty(bVar.e())) {
                    ttcIndex.setFontVariationSettings(bVar.e());
                }
                Font fontBuild = ttcIndex.build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return fontBuild;
            } catch (Throwable th2) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            Log.w("TypefaceCompatApi29Impl", XTkUEXuiK.UWDYaDWGCZ, e10);
            return null;
        }
    }

    private static int n(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // e0.q
    public Typeface a(Context context, d0.e.b bVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builder = null;
            for (d0.e.c cVar : bVar.a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, cVar.b()).setWeight(cVar.e()).setSlant(cVar.f() ? 1 : 0).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(i(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // e0.q
    public Typeface b(Context context, CancellationSignal cancellationSignal, k0.i.b[] bVarArr, int i10) {
        try {
            FontFamily fontFamilyK = k(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyK == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyK).setStyle(i(fontFamilyK, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // e0.q
    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyK = k(cancellationSignal, (k0.i.b[]) list.get(0), contentResolver);
            if (fontFamilyK == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyK);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyK2 = k(cancellationSignal, (k0.i.b[]) list.get(i11), contentResolver);
                if (fontFamilyK2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyK2);
                }
            }
            return customFallbackBuilder.setStyle(i(fontFamilyK, i10).getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    @Override // e0.q
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) {
        try {
            Font fontBuild = new Font.Builder(resources, i10).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e10) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e10);
            return null;
        }
    }

    protected FontFamily k(CancellationSignal cancellationSignal, k0.i.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (k0.i.b bVar : bVarArr) {
            Font fontJ = j(cancellationSignal, bVar, contentResolver);
            if (fontJ != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontJ);
                } else {
                    builder.addFont(fontJ);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    protected Font m(k0.i.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
