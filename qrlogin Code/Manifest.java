package com.example.jijin.qrlogin;

import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public final class Manifest {
    public static volatile transient /* synthetic */ IncrementalChange $change;
    public static final long serialVersionUID = 0;

    public static final class permission {
        public static volatile transient /* synthetic */ IncrementalChange $change = null;
        public static final String C2D_MESSAGE = "com.example.jijin.qrlogin.permission.C2D_MESSAGE";
        public static final long serialVersionUID = 0;

        permission(Object[] objArr, InstantReloadException instantReloadException) {
            switch (((String) objArr[1]).hashCode()) {
                case -1968665286:
                    return;
                case -1937016558:
                    this();
                    return;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{(String) objArr[1], Integer.valueOf(((String) objArr[1]).hashCode()), "com/example/jijin/qrlogin/Manifest$permission"}));
            }
        }

        public static /* synthetic */ Object access$super(permission permission, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2128160755:
                    return super.toString();
                case -1554832987:
                    super.finalize();
                    return null;
                case -1021472056:
                    super.wait(((Number) objArr[0]).longValue());
                    return null;
                case 201261558:
                    return super.getClass();
                case 1403628309:
                    return new Integer(super.hashCode());
                case 1814730534:
                    return new Boolean(super.equals(objArr[0]));
                case 2025021518:
                    return super.clone();
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/jijin/qrlogin/Manifest$permission"}));
            }
        }

        public permission() {
            IncrementalChange incrementalChange = $change;
            if (incrementalChange != null) {
                Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/jijin/qrlogin/Manifest$permission;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, new Object[0]});
                Object[] objArr2 = (Object[]) objArr[0];
                this(objArr, null);
                objArr2[0] = this;
                incrementalChange.access$dispatch("init$body.(Lcom/example/jijin/qrlogin/Manifest$permission;[Ljava/lang/Object;)V", objArr2);
            }
        }
    }

    Manifest(Object[] objArr, InstantReloadException instantReloadException) {
        switch (((String) objArr[1]).hashCode()) {
            case -1968665286:
                return;
            case 116262511:
                this();
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{(String) objArr[1], Integer.valueOf(((String) objArr[1]).hashCode()), "com/example/jijin/qrlogin/Manifest"}));
        }
    }

    public static /* synthetic */ Object access$super(Manifest manifest, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1554832987:
                super.finalize();
                return null;
            case -1021472056:
                super.wait(((Number) objArr[0]).longValue());
                return null;
            case 201261558:
                return super.getClass();
            case 1403628309:
                return new Integer(super.hashCode());
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/jijin/qrlogin/Manifest"}));
        }
    }

    public Manifest() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = (Object[]) incrementalChange.access$dispatch("init$args.([Lcom/example/jijin/qrlogin/Manifest;[Ljava/lang/Object;)Ljava/lang/Object;", new Object[]{null, new Object[0]});
            Object[] objArr2 = (Object[]) objArr[0];
            this(objArr, null);
            objArr2[0] = this;
            incrementalChange.access$dispatch("init$body.(Lcom/example/jijin/qrlogin/Manifest;[Ljava/lang/Object;)V", objArr2);
        }
    }
}
