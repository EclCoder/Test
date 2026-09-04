package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.inmobi.media.AbstractC2891ch;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2891ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f26337a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f26338b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f26339c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f26340d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f26341e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f26342f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f26343g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f26344h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f26345i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f26346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f26347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f26348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static String f26349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Location f26350n;

    public static void a(final boolean z10) {
        f26338b = Boolean.valueOf(z10);
        final Context context = Xi.f26021a;
        if (context != null) {
            Runnable runnable = new Runnable() { // from class: yh.i7
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2891ch.a(context, z10);
                }
            };
            kotlin.jvm.internal.s.h(runnable, "runnable");
            Xi.f26027g.submit(runnable);
        }
    }

    public static Location b() {
        Location location = f26350n;
        if (location != null) {
            return location;
        }
        Context context = Xi.f26021a;
        Location location2 = null;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La laA = Ka.a(context, "user_info_store");
        kotlin.jvm.internal.s.h("user_location", "key");
        String string = laA.f25198a.getString("user_location", null);
        if (string == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] strArr = (String[]) new bm.o(",").j(string, 0).toArray(new String[0]);
            location3.setLatitude(Double.parseDouble(strArr[0]));
            location3.setLongitude(Double.parseDouble(strArr[1]));
            location3.setAccuracy(Float.parseFloat(strArr[2]));
            location3.setTime(Long.parseLong(strArr[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f26350n = location2;
        return location2;
    }

    public static final void a(Context context, boolean z10) {
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        La.a(Ka.a(context, "user_info_store"), "user_age_restricted", z10);
    }

    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        int i10 = f26337a;
        int i11 = Integer.MIN_VALUE;
        if (i10 == Integer.MIN_VALUE) {
            Context context = Xi.f26021a;
            if (context == null) {
                i10 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap = La.f25197b;
                La laA = Ka.a(context, "user_info_store");
                kotlin.jvm.internal.s.h("user_age", "key");
                i10 = laA.f25198a.getInt("user_age", Integer.MIN_VALUE);
            }
            f26337a = i10;
        }
        if (i10 > 0) {
            map.put("u-age", String.valueOf(i10));
        }
        int i12 = f26345i;
        if (i12 == Integer.MIN_VALUE) {
            Context context2 = Xi.f26021a;
            if (context2 != null) {
                ConcurrentHashMap concurrentHashMap2 = La.f25197b;
                La laA2 = Ka.a(context2, "user_info_store");
                kotlin.jvm.internal.s.h("user_yob", "key");
                i11 = laA2.f25198a.getInt("user_yob", Integer.MIN_VALUE);
            }
            f26345i = i11;
            i12 = i11;
        }
        if (i12 > 0) {
            map.put("u-yearofbirth", String.valueOf(i12));
        }
        String string = f26342f;
        String string2 = null;
        if (string == null) {
            Context context3 = Xi.f26021a;
            if (context3 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap3 = La.f25197b;
                La laA3 = Ka.a(context3, "user_info_store");
                kotlin.jvm.internal.s.h("user_city_code", "key");
                string = laA3.f25198a.getString("user_city_code", null);
            }
            f26342f = string;
        }
        String string3 = f26343g;
        if (string3 == null) {
            Context context4 = Xi.f26021a;
            if (context4 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap4 = La.f25197b;
                La laA4 = Ka.a(context4, "user_info_store");
                kotlin.jvm.internal.s.h("user_state_code", "key");
                string3 = laA4.f25198a.getString("user_state_code", null);
            }
            f26343g = string3;
        }
        String string4 = f26344h;
        if (string4 == null) {
            Context context5 = Xi.f26021a;
            if (context5 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap5 = La.f25197b;
                La laA5 = Ka.a(context5, "user_info_store");
                kotlin.jvm.internal.s.h("user_country_code", "key");
                string4 = laA5.f25198a.getString("user_country_code", null);
            }
            f26344h = string4;
        }
        String strA = a(string, string3, string4);
        int length = strA.length() - 1;
        boolean zBooleanValue = false;
        int i13 = 0;
        boolean z10 = false;
        while (i13 <= length) {
            boolean z11 = kotlin.jvm.internal.s.i(strA.charAt(!z10 ? i13 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i13++;
            } else {
                z10 = true;
            }
        }
        if (strA.subSequence(i13, length + 1).toString().length() > 0) {
            map.put("u-location", strA);
        }
        String string5 = f26339c;
        if (string5 == null) {
            Context context6 = Xi.f26021a;
            if (context6 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap6 = La.f25197b;
                La laA6 = Ka.a(context6, "user_info_store");
                kotlin.jvm.internal.s.h("user_age_group", "key");
                string5 = laA6.f25198a.getString("user_age_group", null);
            }
            f26339c = string5;
        }
        if (string5 != null) {
            Locale ENGLISH = Locale.ENGLISH;
            kotlin.jvm.internal.s.g(ENGLISH, "ENGLISH");
            String lowerCase = string5.toLowerCase(ENGLISH);
            kotlin.jvm.internal.s.g(lowerCase, "toLowerCase(...)");
            map.put("u-agegroup", lowerCase);
        }
        String string6 = f26340d;
        if (string6 == null) {
            Context context7 = Xi.f26021a;
            if (context7 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap7 = La.f25197b;
                La laA7 = Ka.a(context7, "user_info_store");
                kotlin.jvm.internal.s.h("user_area_code", "key");
                string6 = laA7.f25198a.getString("user_area_code", null);
            }
            f26340d = string6;
        }
        if (string6 != null) {
            map.put("u-areacode", string6);
        }
        String string7 = f26341e;
        if (string7 == null) {
            Context context8 = Xi.f26021a;
            if (context8 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap8 = La.f25197b;
                La laA8 = Ka.a(context8, "user_info_store");
                kotlin.jvm.internal.s.h("user_post_code", "key");
                string7 = laA8.f25198a.getString("user_post_code", null);
            }
            f26341e = string7;
        }
        if (string7 != null) {
            map.put("u-postalcode", string7);
        }
        String string8 = f26346j;
        if (string8 == null) {
            Context context9 = Xi.f26021a;
            if (context9 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap9 = La.f25197b;
                La laA9 = Ka.a(context9, "user_info_store");
                kotlin.jvm.internal.s.h("user_gender", "key");
                string8 = laA9.f25198a.getString("user_gender", null);
            }
            f26346j = string8;
        }
        if (string8 != null) {
            map.put("u-gender", string8);
        }
        String string9 = f26347k;
        if (string9 == null) {
            Context context10 = Xi.f26021a;
            if (context10 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap10 = La.f25197b;
                La laA10 = Ka.a(context10, "user_info_store");
                kotlin.jvm.internal.s.h("user_education", "key");
                string9 = laA10.f25198a.getString("user_education", null);
            }
            f26347k = string9;
        }
        if (string9 != null) {
            map.put("u-education", string9);
        }
        String string10 = f26348l;
        if (string10 == null) {
            Context context11 = Xi.f26021a;
            if (context11 == null) {
                string10 = null;
            } else {
                ConcurrentHashMap concurrentHashMap11 = La.f25197b;
                La laA11 = Ka.a(context11, "user_info_store");
                kotlin.jvm.internal.s.h("user_language", "key");
                string10 = laA11.f25198a.getString("user_language", null);
            }
            f26348l = string10;
        }
        if (string10 != null) {
            map.put("u-language", string10);
        }
        String str2 = f26349m;
        if (str2 == null) {
            Context context12 = Xi.f26021a;
            if (context12 != null) {
                ConcurrentHashMap concurrentHashMap12 = La.f25197b;
                La laA12 = Ka.a(context12, "user_info_store");
                kotlin.jvm.internal.s.h("user_interest", "key");
                string2 = laA12.f25198a.getString("user_interest", null);
            }
            f26349m = string2;
            str2 = string2;
        }
        if (str2 != null) {
            map.put("u-interests", str2);
        }
        Boolean bool = f26338b;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context13 = Xi.f26021a;
            if (context13 != null) {
                ConcurrentHashMap concurrentHashMap13 = La.f25197b;
                La laA13 = Ka.a(context13, "user_info_store");
                kotlin.jvm.internal.s.h("user_age_restricted", "key");
                f26338b = Boolean.valueOf(laA13.f25198a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = f26338b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
        }
        if (zBooleanValue) {
            str = "1";
        } else {
            str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        map.put("u-age-restricted", str);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    public static String a(String str, String str2, String str3) {
        String string;
        if (str != null) {
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.s.i(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() > 0) {
                int length2 = str.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = kotlin.jvm.internal.s.i(str.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                string = str.subSequence(i11, length2 + 1).toString();
            } else {
                string = "";
            }
        } else {
            string = "";
        }
        if (str2 != null) {
            int length3 = str2.length() - 1;
            int i12 = 0;
            boolean z14 = false;
            while (i12 <= length3) {
                boolean z15 = kotlin.jvm.internal.s.i(str2.charAt(!z14 ? i12 : length3), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length3--;
                } else if (z15) {
                    i12++;
                } else {
                    z14 = true;
                }
            }
            if (str2.subSequence(i12, length3 + 1).toString().length() > 0) {
                int length4 = str2.length() - 1;
                int i13 = 0;
                boolean z16 = false;
                while (i13 <= length4) {
                    boolean z17 = kotlin.jvm.internal.s.i(str2.charAt(!z16 ? i13 : length4), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            break;
                        }
                        length4--;
                    } else if (z17) {
                        i13++;
                    } else {
                        z16 = true;
                    }
                }
                string = string + "-" + str2.subSequence(i13, length4 + 1).toString();
            }
        }
        if (str3 == null) {
            return string;
        }
        int length5 = str3.length() - 1;
        int i14 = 0;
        boolean z18 = false;
        while (i14 <= length5) {
            boolean z19 = kotlin.jvm.internal.s.i(str3.charAt(!z18 ? i14 : length5), 32) <= 0;
            if (z18) {
                if (!z19) {
                    break;
                }
                length5--;
            } else if (z19) {
                i14++;
            } else {
                z18 = true;
            }
        }
        if (str3.subSequence(i14, length5 + 1).toString().length() <= 0) {
            return string;
        }
        int length6 = str3.length() - 1;
        int i15 = 0;
        boolean z20 = false;
        while (i15 <= length6) {
            boolean z21 = kotlin.jvm.internal.s.i(str3.charAt(!z20 ? i15 : length6), 32) <= 0;
            if (z20) {
                if (!z21) {
                    break;
                }
                length6--;
            } else if (z21) {
                i15++;
            } else {
                z20 = true;
            }
        }
        return string + "-" + str3.subSequence(i15, length6 + 1).toString();
    }

    public static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
