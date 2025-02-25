import keyboard

def on_key_event(event):
    print(f"Key '{event.name}' was pressed")

keyboard.on_press(on_key_event)

print("Press any key (Press 'Esc' to exit)...")
keyboard.wait('esc')  # Waits until 'esc' is pressed to exit
