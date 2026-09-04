/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00076fc0
 * Address  : 00076fc0
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00076fc0(void)

{
  __pid_t _Var1;
  int *piVar2;
  int iVar3;
  undefined4 uVar4;
  int iVar5;
  int unaff_r5;
  bool bVar6;
  undefined4 local_28;
  undefined4 local_24;
  undefined8 local_20;
  undefined4 local_18;
  int local_14;
  
  iVar5 = DAT_000770b8;
  local_14 = **(int **)(DAT_000770bc + 0x76fdc);
  local_24 = 0;
  bVar6 = *(int *)(DAT_000770b8 + 0x76ff8) != 0;
  if (bVar6) {
    unaff_r5 = *(int *)(DAT_000770b8 + 0x76ff4);
  }
  uVar4 = 0;
  if (bVar6 && unaff_r5 != 0) {
    _Var1 = getpid();
    if (unaff_r5 == _Var1) {
      piVar2 = *(int **)(iVar5 + 0x76ff8);
      iVar3 = (**(code **)(*piVar2 + 0x18))(piVar2,&local_24,0x10006);
      if (iVar3 == -2) {
        piVar2 = *(int **)(iVar5 + 0x76ff8);
        local_28 = 0;
        local_20 = *(undefined8 *)(DAT_000770c0 + 0x77084);
        local_18 = *(undefined4 *)(DAT_000770c0 + 0x7708c);
        iVar5 = (**(code **)(*piVar2 + 0x1c))(piVar2,&local_28,&local_20);
        uVar4 = local_28;
        if (iVar5 != 0) {
          uVar4 = 0;
        }
      }
      else {
        uVar4 = 0;
        if (iVar3 == 0) {
          uVar4 = local_24;
        }
      }
    }
    else {
      uVar4 = 0;
    }
  }
  if (**(int **)(DAT_000770c4 + 0x77010) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(uVar4);
}


