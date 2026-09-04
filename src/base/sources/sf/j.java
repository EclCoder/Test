package sf;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j implements SharedPreferences {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f52413d = {'a'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f52414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f52415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f52416c = "PBEwithSHAand128BITRC4";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SharedPreferences.Editor f52417a;

        public a() {
            this.f52417a = j.this.f52414a.edit();
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a clear() {
            this.f52417a.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.f52417a.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a putBoolean(String str, boolean z10) {
            this.f52417a.putString(str, j.this.e(Boolean.toString(z10)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a putFloat(String str, float f10) {
            this.f52417a.putString(str, j.this.e(Float.toString(f10)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.f52417a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a putInt(String str, int i10) {
            this.f52417a.putString(str, j.this.e(Integer.toString(i10)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a putLong(String str, long j10) {
            this.f52417a.putString(str, j.this.e(Long.toString(j10)));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a putString(String str, String str2) {
            this.f52417a.putString(str, j.this.e(str2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a remove(String str) {
            this.f52417a.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.contains(" ")) {
                    wp.a.h("SharedPreferencesVip").g(str2, new Object[0]);
                    throw new RuntimeException("String Sets does not work with element(s) containing space");
                }
                if (sb2.length() == 0) {
                    sb2 = new StringBuilder(str2);
                } else {
                    sb2.append(" ");
                    sb2.append(str2);
                }
            }
            putString(str, sb2.toString());
            return this;
        }
    }

    public j(Context context, SharedPreferences sharedPreferences) {
        this.f52414a = sharedPreferences;
        this.f52415b = context;
        f52413d = ("HEROCAT" + Settings.Secure.getString(context.getContentResolver(), "android_id")).toCharArray();
    }

    private String c(String str) {
        try {
            byte[] bArrDecode = str != null ? Base64.decode(str, 0) : new byte[0];
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("PBEwithSHAand128BITRC4").generateSecret(new PBEKeySpec(f52413d));
            Cipher cipher = Cipher.getInstance("PBEwithSHAand128BITRC4");
            String string = Settings.Secure.getString(this.f52415b.getContentResolver(), "android_id");
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(2, secretKeyGenerateSecret, new PBEParameterSpec(string.getBytes(charset), 20));
            return new String(cipher.doFinal(bArrDecode), charset);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str) {
        try {
            byte[] bytes = str != null ? str.getBytes(StandardCharsets.UTF_8) : new byte[0];
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("PBEwithSHAand128BITRC4").generateSecret(new PBEKeySpec(f52413d));
            Cipher cipher = Cipher.getInstance("PBEwithSHAand128BITRC4");
            String string = Settings.Secure.getString(this.f52415b.getContentResolver(), "android_id");
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(1, secretKeyGenerateSecret, new PBEParameterSpec(string.getBytes(charset), 20));
            return new String(Base64.encode(cipher.doFinal(bytes), 2), charset);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f52414a.contains(str);
    }

    @Override // android.content.SharedPreferences
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a edit() {
        return new a();
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        String string = this.f52414a.getString(str, null);
        return string != null ? Boolean.parseBoolean(c(string)) : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        String string = this.f52414a.getString(str, null);
        return string != null ? Float.parseFloat(c(string)) : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        String string = this.f52414a.getString(str, null);
        return string != null ? Integer.parseInt(c(string)) : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        String string = this.f52414a.getString(str, null);
        return string != null ? Long.parseLong(c(string)) : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        String string = this.f52414a.getString(str, null);
        return string != null ? c(string) : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        String string = this.f52414a.getString(str, null);
        if (string == null) {
            return set;
        }
        String strC = c(string);
        return strC.length() == 0 ? Collections.EMPTY_SET : new androidx.collection.b(Arrays.asList(strC.split(" ")));
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f52414a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f52414a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
