package g8;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public enum e {
    ALLOW_JAVA_COMMENTS(false, com.fasterxml.jackson.core.e.a.ALLOW_COMMENTS),
    ALLOW_YAML_COMMENTS(false, com.fasterxml.jackson.core.e.a.ALLOW_YAML_COMMENTS),
    ALLOW_SINGLE_QUOTES(false, com.fasterxml.jackson.core.e.a.ALLOW_SINGLE_QUOTES),
    ALLOW_UNQUOTED_FIELD_NAMES(false, com.fasterxml.jackson.core.e.a.ALLOW_UNQUOTED_FIELD_NAMES),
    ALLOW_UNESCAPED_CONTROL_CHARS(false, com.fasterxml.jackson.core.e.a.ALLOW_UNQUOTED_CONTROL_CHARS),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false, com.fasterxml.jackson.core.e.a.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(false, com.fasterxml.jackson.core.e.a.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false, com.fasterxml.jackson.core.e.a.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_NON_NUMERIC_NUMBERS(false, com.fasterxml.jackson.core.e.a.ALLOW_NON_NUMERIC_NUMBERS),
    ALLOW_MISSING_VALUES(false, com.fasterxml.jackson.core.e.a.ALLOW_MISSING_VALUES),
    ALLOW_TRAILING_COMMA(false, com.fasterxml.jackson.core.e.a.ALLOW_TRAILING_COMMA);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38993b = 1 << ordinal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.fasterxml.jackson.core.e.a f38994c;

    e(boolean z10, com.fasterxml.jackson.core.e.a aVar) {
        this.f38992a = z10;
        this.f38994c = aVar;
    }

    public com.fasterxml.jackson.core.e.a d() {
        return this.f38994c;
    }
}
