program hh_inspector;

uses
  Forms,
  main in 'main.pas' {Form1};

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
//  Application.ShowMainForm := False;
//  Application.MainFormOnTaskBar := False;
  Application.Run;
end.
