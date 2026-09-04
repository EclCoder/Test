/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001ad48
 * Address  : 0001ad48
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001ad48(char *param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4)

{
  undefined4 unaff_r5;
  undefined4 local_c;
  undefined4 uStack_8;
  undefined4 uStack_4;
  
  local_c = param_2;
  uStack_8 = param_3;
  uStack_4 = param_4;
  vfprintf((FILE *)(*(int *)(DAT_0001ada4 + 0x1ad66) + 0xa8),param_1,&local_c);
  vasprintf((char **)&stack0xffffffe4,param_1,&local_c);
  android_set_abort_message(unaff_r5);
  openlog((char *)(DAT_0001ada8 + 0x1ad88),0,0);
  syslog(2,(char *)(DAT_0001adac + 0x1ad94),unaff_r5);
  closelog();
                    /* WARNING: Subroutine does not return */
  abort();
}


