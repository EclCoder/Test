// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 761-780
// ============================================================

// ============================================================
// Function #761
// Name: __stack_chk_fail
// Address: 000a0730
// JNI: NO
// ============================================================


void __stack_chk_fail(void)

{
  (*(code *)PTR___stack_chk_fail_000a5f5c)();
  return;
}




// ============================================================
// Function #762
// Name: fwrite
// Address: 000a0740
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t fwrite(void *__ptr,size_t __size,size_t __n,FILE *__s)

{
  size_t sVar1;
  
  sVar1 = (*(code *)PTR_fwrite_000a5f60)(__ptr);
  return sVar1;
}




// ============================================================
// Function #763
// Name: strlen
// Address: 000a0750
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t strlen(char *__s)

{
  size_t sVar1;
  
  sVar1 = (*(code *)PTR_strlen_000a5f64)(__s);
  return sVar1;
}




// ============================================================
// Function #764
// Name: pthread_cond_signal
// Address: 000a0760
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_signal(pthread_cond_t *__cond)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_cond_signal_000a5f68)(__cond);
  return iVar1;
}




// ============================================================
// Function #765
// Name: stat
// Address: 000a0770
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int stat(char *__file,stat *__buf)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_stat_000a5f6c)(__file);
  return iVar1;
}




// ============================================================
// Function #766
// Name: pthread_mutex_lock
// Address: 000a0780
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutex_lock(pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_mutex_lock_000a5f70)(__mutex);
  return iVar1;
}




// ============================================================
// Function #767
// Name: fflush
// Address: 000a0790
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fflush(FILE *__stream)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_fflush_000a5f74)(__stream);
  return iVar1;
}




// ============================================================
// Function #768
// Name: __aeabi_memclr4
// Address: 000a07a0
// JNI: NO
// ============================================================


void __aeabi_memclr4(void)

{
  (*(code *)PTR___aeabi_memclr4_000a5f78)();
  return;
}




// ============================================================
// Function #769
// Name: __aeabi_memclr8
// Address: 000a07b0
// JNI: NO
// ============================================================


void __aeabi_memclr8(void)

{
  (*(code *)PTR___aeabi_memclr8_000a5f7c)();
  return;
}




// ============================================================
// Function #770
// Name: free
// Address: 000a07c0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void free(void *__ptr)

{
  (*(code *)PTR_free_000a5f80)(__ptr);
  return;
}




// ============================================================
// Function #771
// Name: pthread_create
// Address: 000a07d0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_create(pthread_t *__newthread,pthread_attr_t *__attr,__start_routine *__start_routine,
                  void *__arg)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_create_000a5f84)(__newthread);
  return iVar1;
}




// ============================================================
// Function #772
// Name: strerror_r
// Address: 000a07e0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * strerror_r(int __errnum,char *__buf,size_t __buflen)

{
  char *pcVar1;
  
  pcVar1 = (char *)(*(code *)PTR_strerror_r_000a5f88)(__errnum);
  return pcVar1;
}




// ============================================================
// Function #773
// Name: strtoull
// Address: 000a07f0
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ulonglong strtoull(char *__nptr,char **__endptr,int __base)

{
  ulonglong uVar1;
  
  uVar1 = (*(code *)PTR_strtoull_000a5f8c)(__nptr);
  return uVar1;
}




// ============================================================
// Function #774
// Name: syslog
// Address: 000a0800
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void syslog(int __pri,char *__fmt,...)

{
  (*(code *)PTR_syslog_000a5f90)(__pri);
  return;
}




// ============================================================
// Function #775
// Name: pthread_getspecific
// Address: 000a0810
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * pthread_getspecific(pthread_key_t __key)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_pthread_getspecific_000a5f94)(__key);
  return pvVar1;
}




// ============================================================
// Function #776
// Name: memcpy
// Address: 000a0820
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

void * memcpy(void *__dest,void *__src,size_t __n)

{
  void *pvVar1;
  
  pvVar1 = (void *)(*(code *)PTR_memcpy_000a5f98)(__dest);
  return pvVar1;
}




// ============================================================
// Function #777
// Name: __aeabi_memclr
// Address: 000a0830
// JNI: NO
// ============================================================


void __aeabi_memclr(void)

{
  (*(code *)PTR___aeabi_memclr_000a5f9c)();
  return;
}




// ============================================================
// Function #778
// Name: pthread_mutex_unlock
// Address: 000a0840
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutex_unlock(pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = (*(code *)PTR_pthread_mutex_unlock_000a5fa0)(__mutex);
  return iVar1;
}




// ============================================================
// Function #779
// Name: opendir
// Address: 000a0850
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

DIR * opendir(char *__name)

{
  DIR *pDVar1;
  
  pDVar1 = (DIR *)(*(code *)PTR_opendir_000a5fa4)(__name);
  return pDVar1;
}




// ============================================================
// Function #780
// Name: fmodf
// Address: 000a0860
// JNI: NO
// ============================================================


/* WARNING: Unknown calling convention -- yet parameter storage is locked */

float fmodf(float __x,float __y)

{
  float fVar1;
  
  fVar1 = (float)(*(code *)PTR_fmodf_000a5fa8)();
  return fVar1;
}




