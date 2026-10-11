package pe.edu.cibertec.pacienteservicegrupo05.dto;

import java.util.List;

public record PacienteHistorialDTO(
        Long pacienteId,
        String numeroDocumento,
        String nombreCompleto,
        String tipoSeguro,
        List<DiagnosticoDTO> listaDiagnosticosActivos,
        String estadoPaciente
) {
}
