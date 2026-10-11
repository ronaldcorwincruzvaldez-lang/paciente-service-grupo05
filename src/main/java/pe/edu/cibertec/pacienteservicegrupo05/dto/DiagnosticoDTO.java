package pe.edu.cibertec.pacienteservicegrupo05.dto;

import java.time.LocalDateTime;

public record DiagnosticoDTO(
        Long idDiagnostico,
        String codigoCIE10,
        String descripcion,
        LocalDateTime fechaDiagnostico,
        String gravedad
) {
}
