/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : JNI_OnUnload
 * Address  : 0009da5c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void JNI_OnUnload(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  char *pcVar4;
  undefined4 *puVar5;
  undefined1 *puVar6;
  int iVar7;
  undefined4 uVar8;
  int *piVar9;
  char *pcVar10;
  int iVar11;
  undefined4 *puVar12;
  
  iVar1 = DAT_0009ddd0;
  puVar12 = (undefined4 *)(DAT_0009ddd0 + 0x9da6c);
  iVar11 = DAT_0009ddd0 + 0x9da74;
  FUN_0001ae24(iVar11);
  iVar2 = DAT_0009ddd4;
  pcVar10 = (char *)(DAT_0009ddd4 + 0x9da80);
  if (*(char *)(DAT_0009ddd4 + 0x9da83) == '\x01') {
    pcVar4 = (char *)FUN_00025e6c(DAT_0009ddd8 + 0x9da94);
    if (*pcVar4 == '\x01') {
      puVar5 = (undefined4 *)FUN_00025e6c(DAT_0009dddc + 0x9daac);
      piVar9 = (int *)*puVar5;
    }
    else {
      puVar5 = (undefined4 *)FUN_00025e6c(DAT_0009dde0 + 0x9dd38);
      piVar9 = (int *)FUN_00076fc0();
      iVar3 = DAT_0009dde4;
      *puVar5 = piVar9;
      puVar6 = (undefined1 *)FUN_00025e6c(iVar3 + 0x9dd54);
      *puVar6 = 1;
    }
    iVar3 = DAT_0009dde8;
    puVar5 = (undefined4 *)(DAT_0009dde8 + 0x9dac0);
    iVar7 = *(int *)(DAT_0009dde8 + 0x9db18);
    *(undefined4 *)(DAT_0009dde8 + 0x9db24) = 0;
    *(undefined4 *)(iVar3 + 0x9db28) = 0;
    *(undefined4 *)(iVar3 + 0x9db2c) = 0;
    *(undefined4 *)(iVar3 + 0x9db30) = 0;
    *(undefined4 *)(iVar3 + 0x9db34) = 0;
    *(undefined4 *)(iVar3 + 0x9db1c) = 0;
    *(undefined4 *)(iVar3 + 0x9db04) = 0;
    *(undefined4 *)(iVar3 + 0x9db08) = 0;
    *(undefined4 *)(iVar3 + 0x9db0c) = 0;
    *(undefined4 *)(iVar3 + 0x9db10) = 0;
    *(undefined4 *)(iVar3 + 0x9db14) = 0;
    *(undefined4 *)(iVar3 + 0x9dae4) = 0;
    *(undefined4 *)(iVar3 + 0x9dae8) = 0;
    *(undefined4 *)(iVar3 + 0x9daec) = 0;
    *(undefined4 *)(iVar3 + 0x9daf0) = 0;
    *(undefined4 *)(iVar3 + 0x9daf4) = 0;
    *(undefined4 *)(iVar3 + 0x9daf8) = 0;
    *(undefined4 *)(iVar3 + 0x9dafc) = 0;
    *(undefined4 *)(iVar3 + 0x9db00) = 0;
    if (iVar7 != 0) {
      (**(code **)(*piVar9 + 0x58))(piVar9);
      *(undefined4 *)(iVar3 + 0x9db18) = 0;
    }
    if (*(int *)(iVar3 + 0x9db20) != 0) {
      (**(code **)(*piVar9 + 0x58))(piVar9);
      *(undefined4 *)(iVar3 + 0x9db20) = 0;
    }
    iVar7 = *(int *)(iVar1 + 0x9da70);
    *(undefined4 *)(iVar3 + 0x9db38) = 0;
    *(undefined1 *)(iVar2 + 0x9da81) = 0;
    *puVar12 = 0;
    if (iVar7 != 0) {
      (**(code **)(*piVar9 + 0x58))(piVar9);
      *(undefined4 *)(iVar1 + 0x9da70) = 0;
    }
    *(undefined1 *)(iVar2 + 0x9da82) = 0;
    if (*(char *)(iVar2 + 0x9da84) == '\x01') {
      pcVar4 = (char *)FUN_00025e6c(DAT_0009ddec + 0x9db98);
      if (*pcVar4 == '\x01') {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009ddf0 + 0x9dbb0);
        piVar9 = (int *)*puVar12;
      }
      else {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009ddf4 + 0x9dd6c);
        piVar9 = (int *)FUN_00076fc0();
        iVar7 = DAT_0009ddf8;
        *puVar12 = piVar9;
        puVar6 = (undefined1 *)FUN_00025e6c(iVar7 + 0x9dd88);
        *puVar6 = 1;
      }
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar1 + 0x9da78));
      *(undefined4 *)(iVar1 + 0x9da80) = 0;
      *(undefined4 *)(iVar1 + 0x9da78) = 0;
      *(undefined1 *)(iVar2 + 0x9da84) = 0;
    }
    if (*pcVar10 == '\x01') {
      pcVar4 = (char *)FUN_00025e6c(DAT_0009ddfc + 0x9dbec);
      if (*pcVar4 == '\x01') {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009de00 + 0x9dc04);
        piVar9 = (int *)*puVar12;
      }
      else {
        puVar12 = (undefined4 *)FUN_00025e6c(DAT_0009de04 + 0x9dda8);
        piVar9 = (int *)FUN_00076fc0();
        iVar1 = DAT_0009de08;
        *puVar12 = piVar9;
        puVar6 = (undefined1 *)FUN_00025e6c(iVar1 + 0x9ddc4);
        *puVar6 = 1;
      }
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9daf4));
      uVar8 = *(undefined4 *)(iVar3 + 0x9dad0);
      *(undefined4 *)(iVar2 + 0x9daf4) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,uVar8);
      *(undefined4 *)(iVar3 + 0x9dad0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar3 + 0x9dac4));
      *(undefined4 *)(iVar3 + 0x9dac4) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dac0));
      *(undefined4 *)(iVar2 + 0x9dac0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9daec));
      *(undefined4 *)(iVar2 + 0x9daec) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dae0));
      *(undefined4 *)(iVar2 + 0x9dae0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dad0));
      *(undefined4 *)(iVar2 + 0x9dad0) = 0;
      (**(code **)(*piVar9 + 0x58))(piVar9,*(undefined4 *)(iVar2 + 0x9dae8));
      *(undefined4 *)(iVar3 + 0x9dac8) = 0;
      *(undefined4 *)(iVar3 + 0x9dacc) = 0;
      *puVar5 = 0;
      *(undefined4 *)(iVar2 + 0x9dae4) = 0;
      *(undefined4 *)(iVar2 + 0x9dae8) = 0;
      *(undefined4 *)(iVar2 + 0x9dad4) = 0;
      *(undefined4 *)(iVar2 + 0x9dad8) = 0;
      *(undefined4 *)(iVar2 + 0x9dadc) = 0;
      *(undefined4 *)(iVar2 + 0x9daf0) = 0;
      *(undefined4 *)(iVar2 + 0x9daf8) = 0;
      *(undefined4 *)(iVar2 + 0x9dac4) = 0;
      *(undefined4 *)(iVar2 + 0x9dac8) = 0;
      *(undefined4 *)(iVar2 + 0x9dacc) = 0;
      *(undefined4 *)(iVar2 + 0x9dab8) = 0;
      *(undefined4 *)(iVar2 + 0x9dabc) = 0;
      *(undefined4 *)(iVar3 + 0x9dad4) = 0;
      *(undefined4 *)(iVar3 + 0x9dad8) = 0;
      *pcVar10 = '\0';
    }
    *(undefined4 *)(iVar3 + 0x9dadc) = 0;
    *(undefined4 *)(iVar3 + 0x9dae0) = 0;
    *(undefined1 *)(iVar2 + 0x9da83) = 0;
  }
  FUN_0001ae3c(iVar11);
  return;
}


