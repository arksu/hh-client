unit main;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ShellAPI, ExtCtrls, Menus, JvComponentBase, JvTrayIcon,
  JvExStdCtrls, JvEdit, Registry;

type
  TForm1 = class(TForm)
    Button1: TButton;
    Timer1: TTimer;
    JvTrayIcon1: TJvTrayIcon;
    PopupMenu1: TPopupMenu;
    N1: TMenuItem;
    N2: TMenuItem;
    JvEdit1: TJvEdit;
    Label1: TLabel;
    JvEdit2: TJvEdit;
    Label2: TLabel;
    JvEdit3: TJvEdit;
    Label3: TLabel;
    Label4: TLabel;
    Label5: TLabel;
    Button2: TButton;
    Button3: TButton;
    procedure Button1Click(Sender: TObject);
    procedure Timer1Timer(Sender: TObject);
    procedure N2Click(Sender: TObject);
    procedure N1Click(Sender: TObject);
    procedure JvTrayIcon1Click(Sender: TObject; Button: TMouseButton;
      Shift: TShiftState; X, Y: Integer);
    procedure FormCreate(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure FormCloseQuery(Sender: TObject; var CanClose: Boolean);
  private
    { Private declarations }
  public
    { Public declarations }
    starts_count : Integer;
    procedure SaveParams;
    procedure LoadParams;
    procedure StartProg;
    function IsStarted : Boolean;
  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject);
begin
  Timer1Timer(self);
  Timer1.Enabled := true;
end;

procedure TForm1.Button3Click(Sender: TObject);
begin
  SaveParams;
end;

procedure TForm1.FormCloseQuery(Sender: TObject; var CanClose: Boolean);
begin
  CanClose := False;
  JvTrayIcon1.HideApplication;
end;

procedure TForm1.FormCreate(Sender: TObject);
begin
  starts_count := 0;
  LoadParams;
end;

function TForm1.IsStarted: Boolean;
begin
  Result := FindWindow( 'SunAwtFrame', nil) > 0;
end;

procedure TForm1.JvTrayIcon1Click(Sender: TObject; Button: TMouseButton;
  Shift: TShiftState; X, Y: Integer);
begin
  if Button = mbRight then
    PopupMenu1.Popup(X,Y);
  if Button = mbLeft then begin
    Form1.Visible := not Form1.Visible;
    Application.BringToFront;
  end;
end;

procedure TForm1.LoadParams;
var
  r : TRegistry;
begin
  r := TRegistry.Create;
  if r.OpenKey('\Software\arksu\hh_inspector', false) then begin
    JvEdit1.Text := r.ReadString( 'app' );
    JvEdit2.Text := r.ReadString( 'params' );
    JvEdit3.Text := r.ReadString( 'dir' );
  end;
  r.Free;
end;

procedure TForm1.N1Click(Sender: TObject);
begin
  Timer1Timer(self);
  Timer1.Enabled := true;
end;

procedure TForm1.N2Click(Sender: TObject);
begin
  SaveParams;
  Application.Terminate;
end;

procedure TForm1.SaveParams;
var
  r : TRegistry;
begin
  r := TRegistry.Create;
  if r.OpenKey('\Software\arksu\hh_inspector', true) then begin
    r.WriteString( 'app', JvEdit1.Text );
    r.WriteString( 'params', JvEdit2.Text );
    r.WriteString( 'dir', JvEdit3.Text );
  end;
  r.Free;
end;

procedure TForm1.StartProg;
begin
  starts_count := starts_count + 1;
  Label5.Caption := IntToStr(starts_count);
  JvTrayIcon1.Hint := 'hh inspector by arksu (13.12.2010) starts count = ' + IntToStr(starts_count);
  ShellExecute( Handle, 'open', PChar(JvEdit1.Text) , PChar(JvEdit2.Text),
  PChar(JvEdit3.Text), SW_RESTORE )
end;

procedure TForm1.Timer1Timer(Sender: TObject);
begin
  if not IsStarted then
    StartProg;
end;

end.
